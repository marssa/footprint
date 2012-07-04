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
package org.marssa.footprint.datatypes.time;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.logger.MMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Minutes", factoryClass = TypeFactory.class, factoryMethod = "getMinutesInstance")
@Entity
public class Minutes extends ATime {
	private static Logger Minutes = LoggerFactory.getLogger("Minutes");

	public Minutes() {
	}

	public Minutes(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Minutes.trace(MMarker.GETTER,
				"Converting from Minutes to MilliSeconds : {}",
				time * 60 * 1000);
		return time * 60 * 1000;
	}

	@Override
	public long getSeconds() {
		Minutes.trace(MMarker.GETTER,
				"Converting from Minutes to Seconds : {}", time * 60);
		return time * 60;
	}

	@Override
	public long getMinutes() {
		Minutes.trace(MMarker.GETTER, "Getting Minutes: {}", time);
		return time;
	}

	@Override
	public long getHour() {
		Minutes.trace(MMarker.GETTER, "Converting from Minutes to Hour : {}",
				time / 60);
		return time / 60;
	}
}
