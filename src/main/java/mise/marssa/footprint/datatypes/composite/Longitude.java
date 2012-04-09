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
	private APosition longitude;

	private static Logger Longitude = (Logger) LoggerFactory
			.getLogger("Longitude");

	public Longitude(DegreesInteger degrees, MInteger minutes, MDecimal seconds)
			throws OutOfRange {

		super(degrees, minutes, seconds);

		if (degrees.getValue() < -180 && degrees.getValue() > 180)
			Longitude.debug(MMarker.EXCEPTION,
					"Degrees value is out of range -180 < degrees < 180",
					new OutOfRange());
		if (minutes.getValue() < 0 && minutes.getValue() > 60)
			Longitude.debug(MMarker.EXCEPTION,
					"Degrees value is out of range 0 < degrees < 60",
					new OutOfRange());
		if (seconds.doubleValue() < 0 && seconds.doubleValue() > 60)
			Longitude.debug(MMarker.EXCEPTION,
					"Degrees value is out of range 60 < degrees < 60",
					new OutOfRange());
	}

	public Longitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if (degrees.doubleValue() < -180 && degrees.doubleValue() > 180)
			Longitude.debug(MMarker.EXCEPTION,
					"Degrees value is out of range -180 < degrees < 180",
					new OutOfRange());
	}

	public void finalize() throws Throwable {

	}

	public java.lang.String toString() {
		return "DDDMMSS.S: " + longitude;
	}

}
