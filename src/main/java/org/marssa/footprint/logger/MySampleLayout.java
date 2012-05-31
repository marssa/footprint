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

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.LayoutBase;

public class MySampleLayout extends LayoutBase<ILoggingEvent> {

	public String doLayout(ILoggingEvent event) {
		StringBuffer sbuf = new StringBuffer(128);
		java.sql.Timestamp sqlDate = new java.sql.Timestamp(
				event.getTimeStamp());
		sbuf.append(sqlDate + "\t");
		sbuf.append(" [");
		sbuf.append(event.getThreadName());
		sbuf.append("] ");
		sbuf.append(" ");
		sbuf.append(event.getLevel() + "\t");
		sbuf.append(" ");
		sbuf.append(event.getLoggerName() + "\t");
		sbuf.append(" - ");
		sbuf.append(event.getFormattedMessage() + "\t - ");
		sbuf.append(event.getMarker());
		sbuf.append(CoreConstants.LINE_SEPARATOR);

		return sbuf.toString();
	}
}
