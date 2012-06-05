/**
 * Copyright 2012 MARSEC-XL International Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.marssa.footprint.logger;

/**
 * @author Warren Zahra
 *
 */

import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import ch.qos.logback.classic.db.DBHelper;
import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.DefaultDBNameResolver;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.classic.spi.IThrowableProxy;
import ch.qos.logback.classic.spi.StackTraceElementProxy;
import ch.qos.logback.classic.spi.ThrowableProxyUtil;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.db.DBAppenderBase;

/**
 * The DBAppender inserts logging events into three database tables in a format
 * independent of the Java programming language.
 * 
 * For more information about this appender, please refer to the online manual
 * at http://logback.qos.ch/manual/appenders.html#DBAppender
 * 
 * @author Ceki G&uuml;lc&uuml;
 * @author Ray DeCampo
 * @author S&eacute;bastien Pennec
 */
public class MDBAppender extends DBAppenderBase<ILoggingEvent> {
	protected String insertPropertiesSQL;
	protected String insertExceptionSQL;
	protected String insertSQL;
	protected static final Method GET_GENERATED_KEYS_METHOD;

	private DBNameResolver dbNameResolver;

	static final int TIMESTMP_INDEX = 1;
	static final int FORMATTED_MESSAGE_INDEX = 2;
	static final int LOGGER_NAME_INDEX = 3;
	static final int LEVEL_STRING_INDEX = 4;
	static final int THREAD_NAME_INDEX = 5;
	static final int REFERENCE_FLAG_INDEX = 6;
	static final int ARG0_INDEX = 7;
	static final int ARG1_INDEX = 8;
	static final int ARG2_INDEX = 9;
	static final int ARG3_INDEX = 10;
	static final int CALLER_FILENAME_INDEX = 11;
	static final int CALLER_CLASS_INDEX = 12;
	static final int CALLER_METHOD_INDEX = 13;
	static final int CALLER_LINE_INDEX = 14;

	static final int MARKER_TYPE_INDEX = 15;
	static final int EVENT_ID_INDEX = 16;
	static {
		// PreparedStatement.getGeneratedKeys() method was added in JDK 1.4
		Method getGeneratedKeysMethod;
		try {
			// the
			getGeneratedKeysMethod = PreparedStatement.class.getMethod(
					"getGeneratedKeys", (Class[]) null);
		} catch (Exception ex) {
			getGeneratedKeysMethod = null;
		}
		GET_GENERATED_KEYS_METHOD = getGeneratedKeysMethod;
	}

	public MDBAppender() {
	}

	public void setDbNameResolver(DBNameResolver dbNameResolver) {
		this.dbNameResolver = dbNameResolver;
	}

	@Override
	public void start() {
		if (dbNameResolver == null)
			dbNameResolver = new DefaultDBNameResolver();
		insertExceptionSQL = MSQLBuilder
				.buildInsertExceptionSQL(dbNameResolver);
		insertPropertiesSQL = MSQLBuilder
				.buildInsertPropertiesSQL(dbNameResolver);
		insertSQL = MSQLBuilder.buildInsertSQL(dbNameResolver);
		super.start();
	}

	@Override
	protected void subAppend(ILoggingEvent event, Connection connection,
			PreparedStatement insertStatement) throws Throwable {

		bindLoggingEventWithInsertStatement(insertStatement, event);
		bindLoggingEventArgumentsWithPreparedStatement(insertStatement,
				event.getArgumentArray());

		// This is expensive... should we do it every time?
		bindCallerDataWithPreparedStatement(insertStatement,
				event.getCallerData());

		int updateCount = insertStatement.executeUpdate();
		if (updateCount != 1) {
			addWarn("Failed to insert loggingEvent");
		}
	}

	protected void secondarySubAppend(ILoggingEvent event,
			Connection connection, long eventId) throws Throwable {
		Map<String, String> mergedMap = mergePropertyMaps(event);
		insertProperties(mergedMap, connection, eventId);

		if (event.getThrowableProxy() != null) {
			insertThrowable(event.getThrowableProxy(), connection, eventId);
		}
	}

	void bindLoggingEventWithInsertStatement(PreparedStatement stmt,
			ILoggingEvent event) throws SQLException {
		stmt.setLong(TIMESTMP_INDEX, event.getTimeStamp());
		stmt.setString(FORMATTED_MESSAGE_INDEX, event.getFormattedMessage());
		stmt.setString(LOGGER_NAME_INDEX, event.getLoggerName());
		stmt.setString(LEVEL_STRING_INDEX, event.getLevel().toString());
		stmt.setString(THREAD_NAME_INDEX, event.getThreadName());
		stmt.setShort(REFERENCE_FLAG_INDEX,
				DBHelper.computeReferenceMask(event));
		// String marker =;
		if (event.getMarker() == null)
			stmt.setString(MARKER_TYPE_INDEX, null);
		else
			stmt.setString(MARKER_TYPE_INDEX, event.getMarker().getName());

	}

	void bindLoggingEventArgumentsWithPreparedStatement(PreparedStatement stmt,
			Object[] argArray) throws SQLException {

		int arrayLen = argArray != null ? argArray.length : 0;

		for (int i = 0; i < arrayLen && i < 4; i++) {
			stmt.setString(ARG0_INDEX + i, asStringTruncatedTo254(argArray[i]));
		}
		if (arrayLen < 4) {
			for (int i = arrayLen; i < 4; i++) {
				stmt.setString(ARG0_INDEX + i, null);
			}
		}
	}

	String asStringTruncatedTo254(Object o) {
		String s = null;
		if (o != null) {
			s = o.toString();
		}

		if (s == null) {
			return null;
		}
		if (s.length() <= 254) {
			return s;
		} else {
			return s.substring(0, 254);
		}
	}

	void bindCallerDataWithPreparedStatement(PreparedStatement stmt,
			StackTraceElement[] callerDataArray) throws SQLException {
		StackTraceElement callerData = callerDataArray[0];
		if (callerData != null) {
			stmt.setString(CALLER_FILENAME_INDEX, callerData.getFileName());
			stmt.setString(CALLER_CLASS_INDEX, callerData.getClassName());
			stmt.setString(CALLER_METHOD_INDEX, callerData.getMethodName());
			stmt.setString(CALLER_LINE_INDEX,
					Integer.toString(callerData.getLineNumber()));
		}
	}

	Map<String, String> mergePropertyMaps(ILoggingEvent event) {
		Map<String, String> mergedMap = new HashMap<String, String>();
		// we add the context properties first, then the event properties, since
		// we consider that event-specific properties should have priority over
		// context-wide properties.
		Map<String, String> loggerContextMap = event.getLoggerContextVO()
				.getPropertyMap();
		Map<String, String> mdcMap = event.getMDCPropertyMap();
		if (loggerContextMap != null) {
			mergedMap.putAll(loggerContextMap);
		}
		if (mdcMap != null) {
			mergedMap.putAll(mdcMap);
		}

		return mergedMap;
	}

	@Override
	protected Method getGeneratedKeysMethod() {
		return GET_GENERATED_KEYS_METHOD;
	}

	@Override
	protected String getInsertSQL() {
		return insertSQL;
	}

	protected void insertProperties(Map<String, String> mergedMap,
			Connection connection, long eventId) throws SQLException {
		Set<String> propertiesKeys = mergedMap.keySet();
		if (propertiesKeys.size() > 0) {
			PreparedStatement insertPropertiesStatement = connection
					.prepareStatement(insertPropertiesSQL);

			for (Iterator<String> i = propertiesKeys.iterator(); i.hasNext();) {
				String key = i.next();
				String value = mergedMap.get(key);

				insertPropertiesStatement.setLong(1, eventId);
				insertPropertiesStatement.setString(2, key);
				insertPropertiesStatement.setString(3, value);

				if (cnxSupportsBatchUpdates) {
					insertPropertiesStatement.addBatch();
				} else {
					insertPropertiesStatement.execute();
				}
			}

			if (cnxSupportsBatchUpdates) {
				insertPropertiesStatement.executeBatch();
			}

			insertPropertiesStatement.close();
			insertPropertiesStatement = null;
		}
	}

	/**
	 * Add an exception statement either as a batch or execute immediately if
	 * batch updates are not supported.
	 */
	void updateExceptionStatement(PreparedStatement exceptionStatement,
			String txt, short i, long eventId) throws SQLException {
		exceptionStatement.setLong(1, eventId);
		exceptionStatement.setShort(2, i);
		exceptionStatement.setString(3, txt);
		if (cnxSupportsBatchUpdates) {
			exceptionStatement.addBatch();
		} else {
			exceptionStatement.execute();
		}
	}

	short buildExceptionStatement(IThrowableProxy tp, short baseIndex,
			PreparedStatement insertExceptionStatement, long eventId)
			throws SQLException {

		StringBuilder buf = new StringBuilder();
		ThrowableProxyUtil.subjoinFirstLine(buf, tp);
		updateExceptionStatement(insertExceptionStatement, buf.toString(),
				baseIndex++, eventId);

		int commonFrames = tp.getCommonFrames();
		StackTraceElementProxy[] stepArray = tp
				.getStackTraceElementProxyArray();
		for (int i = 0; i < stepArray.length - commonFrames; i++) {
			StringBuilder sb = new StringBuilder();
			sb.append(CoreConstants.TAB);
			ThrowableProxyUtil.subjoinSTEP(sb, stepArray[i]);
			updateExceptionStatement(insertExceptionStatement, sb.toString(),
					baseIndex++, eventId);
		}

		if (commonFrames > 0) {
			StringBuilder sb = new StringBuilder();
			sb.append(CoreConstants.TAB).append("... ").append(commonFrames)
					.append(" common frames omitted");
			updateExceptionStatement(insertExceptionStatement, sb.toString(),
					baseIndex++, eventId);
		}

		return baseIndex;
	}

	protected void insertThrowable(IThrowableProxy tp, Connection connection,
			long eventId) throws SQLException {

		PreparedStatement exceptionStatement = connection
				.prepareStatement(insertExceptionSQL);

		short baseIndex = 0;
		while (tp != null) {
			baseIndex = buildExceptionStatement(tp, baseIndex,
					exceptionStatement, eventId);
			tp = tp.getCause();
		}

		if (cnxSupportsBatchUpdates) {
			exceptionStatement.executeBatch();
		}
		exceptionStatement.close();
		exceptionStatement = null;

	}

}