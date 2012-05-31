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
/**
 * 
 */
package org.marssa.footprint.logger;

import ch.qos.logback.classic.db.names.DBNameResolver;
import ch.qos.logback.classic.db.names.TableName;

/**
 * @author Warren Zahra
 *
 */
/**
 * Logback: the reliable, generic, fast and flexible logging framework.
 * Copyright (C) 1999-2011, QOS.ch. All rights reserved.
 *
 * This program and the accompanying materials are dual-licensed under
 * either the terms of the Eclipse Public License v1.0 as published by
 * the Eclipse Foundation
 *
 *   or (per the licensee's choosing)
 *
 * under the terms of the GNU Lesser General Public License version 2.1
 * as published by the Free Software Foundation.
 */

/**
 * @author Tomasz Nurkiewicz
 * @since 2010-03-16
 */
public class MSQLBuilder {

	static String buildInsertPropertiesSQL(DBNameResolver dbNameResolver) {
		StringBuilder sqlBuilder = new StringBuilder("INSERT INTO ");
		sqlBuilder.append(
				dbNameResolver.getTableName(TableName.LOGGING_EVENT_PROPERTY))
				.append(" (");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.EVENT_ID))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.MAPPED_KEY))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.MAPPED_VALUE)).append(
				") ");
		sqlBuilder.append("VALUES (?, ?, ?)");
		return sqlBuilder.toString();
	}

	static String buildInsertExceptionSQL(DBNameResolver dbNameResolver) {
		StringBuilder sqlBuilder = new StringBuilder("INSERT INTO ");
		sqlBuilder.append(
				dbNameResolver.getTableName(TableName.LOGGING_EVENT_EXCEPTION))
				.append(" (");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.EVENT_ID))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.I)).append(
				", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.TRACE_LINE))
				.append(") ");
		sqlBuilder.append("VALUES (?, ?, ?)");
		return sqlBuilder.toString();
	}

	static String buildInsertSQL(DBNameResolver dbNameResolver) {
		StringBuilder sqlBuilder = new StringBuilder("INSERT INTO ");
		sqlBuilder.append(dbNameResolver.getTableName(TableName.LOGGING_EVENT))
				.append(" (");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.TIMESTMP))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.FORMATTED_MESSAGE))
				.append(", ");
		sqlBuilder
				.append(dbNameResolver.getColumnName(MColumnName.LOGGER_NAME))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.LEVEL_STRING)).append(
				", ");
		sqlBuilder
				.append(dbNameResolver.getColumnName(MColumnName.THREAD_NAME))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.REFERENCE_FLAG))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.ARG0))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.ARG1))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.ARG2))
				.append(", ");
		sqlBuilder.append(dbNameResolver.getColumnName(MColumnName.ARG3))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.CALLER_FILENAME))
				.append(", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.CALLER_CLASS)).append(
				", ");
		sqlBuilder.append(
				dbNameResolver.getColumnName(MColumnName.CALLER_METHOD))
				.append(", ");
		sqlBuilder
				.append(dbNameResolver.getColumnName(MColumnName.CALLER_LINE))
				.append(", ");
		sqlBuilder
				.append(dbNameResolver.getColumnName(MColumnName.MARKER_TYPE))
				.append(" ) ");
		sqlBuilder
				.append("VALUES (?, ?, ? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)");
		return sqlBuilder.toString();
	}
}
