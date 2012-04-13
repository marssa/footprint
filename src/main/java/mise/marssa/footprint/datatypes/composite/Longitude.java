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
package mise.marssa.footprint.datatypes.composite;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Longitude", factoryClass = TypeFactory.class, factoryMethod = "getLongitudeInstance")
@Entity
public class Longitude extends APosition {

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(Longitude.class.getName());

	public Longitude(DegreesInteger degrees, MInteger minutes, MDecimal seconds)
			throws OutOfRange {

		super(degrees, minutes, seconds);

		if (degrees.intValue() < -180 && degrees.intValue() > 180)
			logger.debug(MMarker.EXCEPTION,
					"Degrees value is out of range -180 < degrees < 180",
					new OutOfRange());
		if (minutes.intValue() < 0 && minutes.intValue() > 60)
			logger.debug(MMarker.EXCEPTION,
					"Minutes value is out of range 0 < minutes < 60",
					new OutOfRange());
		if (seconds.doubleValue() < 0 && seconds.doubleValue() > 60)
			logger.debug(MMarker.EXCEPTION,
					"Seconds value is out of range 60 < seconds < 60",
					new OutOfRange());
	}

	public Longitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if (degrees.doubleValue() < -180 && degrees.doubleValue() > 180)
			logger.debug(MMarker.EXCEPTION,
					"Degrees value is out of range -180 < degrees < 180",
					new OutOfRange());
	}

	public void finalize() throws Throwable {

	}

	public String toString() {
		return "DDDMMSS.S: " + super.toString();
	}

}
