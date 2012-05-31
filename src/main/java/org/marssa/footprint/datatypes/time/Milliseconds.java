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
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Lifebook
 * 
 */
@XmlType(name = "Milliseconds", factoryClass = TypeFactory.class, factoryMethod = "getMillisecondsInstance")
@Entity
public class Milliseconds extends ATime {

	// TODO switch conversions to use JSCience
	private static Logger MilliSeconds = (Logger) LoggerFactory
			.getLogger("MilliSeconds");

	public Milliseconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		MilliSeconds.trace(MMarker.GETTER, "Getting MilliSeconds: {}", time);
		return time;
	}

	@Override
	public long getSeconds() {
		MilliSeconds.trace(MMarker.GETTER,
				"Converting from MilliSeconds to Seconds : {}", time / 1000);
		return time / 1000;
	}

	@Override
	public long getMinutes() {
		MilliSeconds.trace(MMarker.GETTER,
				"Converting from MilliSeconds to Minutes : {}", time
						/ (1000 * 60));
		return time / (1000 * 60);
	}

	@Override
	public long getHour() {
		MilliSeconds.trace(MMarker.GETTER,
				"Converting from MilliSeconds to Hours : {}", time
						/ (1000 * 60 * 60));
		return time / (1000 * 60 * 60);
	}
}
