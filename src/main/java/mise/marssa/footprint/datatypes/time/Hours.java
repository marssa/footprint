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
package mise.marssa.footprint.datatypes.time;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Hours", factoryClass = TypeFactory.class, factoryMethod = "getHoursInstance")
public class Hours extends ATime {

	private static Logger Hours = (Logger) LoggerFactory.getLogger("Hours");

	public Hours(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Hours.trace(MMarker.GETTER,
				"Converting from Hours to MilliSeconds : {}",
				time * 60 * 60 * 1000);
		return time * 60 * 60 * 1000;
	}

	@XmlElement(required = true)
	@Override
	public long getSeconds() {
		Hours.trace(MMarker.GETTER, "Converting from Hours to Seconds : {}",
				time * 60 * 60);
		return time * 60 * 60;
	}

	@Override
	public long getMinutes() {
		Hours.trace(MMarker.GETTER, "Converting from Hours to Minutes : {}",
				time * 60);
		return time * 60;
	}

	@Override
	public long getHour() {
		Hours.trace(MMarker.GETTER, "Getting Hours: {}", time);
		return time;
	}
}
