/**
 * Copyright 2012 MARSEC-XL Foundation
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
@XmlType(name = "Latitude", factoryClass = TypeFactory.class, factoryMethod = "getLatitudeInstance")

public class Latitude extends APosition {

	//private APosition latitude;
	private static Logger Latitude = (Logger) LoggerFactory.getLogger("Latitude");
	public Latitude(DegreesInteger degrees, MInteger minutes, MDecimal seconds) throws OutOfRange {
		super(degrees, minutes, seconds);
		if(degrees.getValue() < -90 && degrees.getValue() > 90)
			Latitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -90 < degrees < 90",new OutOfRange());
		if(minutes.getValue() < 0 && minutes.getValue() > 60)
			Latitude.debug(MMarker.EXCEPTION,"Minutes value is out of range 0 < minutes < 60",new OutOfRange());
		if(seconds.doubleValue() < 0 && seconds.doubleValue() > 60)
			Latitude.debug(MMarker.EXCEPTION,"Seconds value is out of range 60 < minutes < 60",new OutOfRange());
			
		
	}
	
	public Latitude(DegreesFloat degrees) throws OutOfRange {
		super(degrees);
		if(degrees.doubleValue() < -90 && degrees.doubleValue() > 90)
			Latitude.debug(MMarker.EXCEPTION,"Degrees value is out of range -90 < minutes < 90",new OutOfRange());	
	}

	public void finalize() throws Throwable {

	}

	
	
	public java.lang.String toString() {
		return "DDMMSS.S: [" + degrees + "\u00b0, " + minutes + "', " + seconds + "\"]";
	}
	
}
