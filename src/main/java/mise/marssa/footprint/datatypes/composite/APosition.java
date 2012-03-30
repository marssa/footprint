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

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "APosition", factoryClass = TypeFactory.class, factoryMethod = "getAPositionInstance")

public abstract class APosition {
	static Logger APosition = (Logger) LoggerFactory.getLogger("APosition");
	// TODO Remove one of the internal representations
	protected DegreesInteger degrees;
	protected MInteger minutes;
	protected MFloat seconds;
	protected DegreesFloat dms;

	public APosition(DegreesInteger degrees, MInteger minutes, MFloat seconds) {
		this.degrees = degrees;
		this.minutes = minutes;
		this.seconds = seconds;
		Object[] aPosition = {degrees,minutes,seconds};
		//APosition.trace(MMarker.CONSTRUCTOR,"Constructor created with  Degrees:\"{}\", Minutes:\"{}\",Seconds:\"{}\" ", aPosition);
		// Do conversion
		if (degrees.getValue() > 0) {
			float convertedValue = (degrees.getValue() + (((minutes.getValue() * 60) + (seconds
					.getValue())) / 3600));
			this.dms = new DegreesFloat(convertedValue);
		} else if (degrees.getValue() < 0) {
			float convertedValue = -(degrees.getValue() + (((minutes.getValue() * 60) + (seconds
					.getValue())) / 3600));
			this.dms = new DegreesFloat(-convertedValue);
		}

	}
	

	public APosition(DegreesFloat degrees) {
		//APosition.trace(MMarker.CONSTRUCTOR,"Constructor created with  Degrees:\"{}f\".", degrees);
		float degFloat = degrees.getValue();
		this.dms = degrees;
		this.degrees = new DegreesInteger((int) java.lang.Math.floor(degFloat));

		float minFloat = 60 * java.lang.Math.abs(degFloat
				- this.degrees.getValue());
		this.minutes = new MInteger((int) minFloat);

		float secFloat = 60 * (minFloat - this.minutes.getValue());
		if (secFloat == 60) {
			this.minutes = new MInteger(this.minutes.getValue() + 1);
			secFloat = 0;
		}
		this.seconds = new MFloat(secFloat);
		if (this.minutes.getValue() == 60) {
			this.degrees = new DegreesInteger(this.degrees.getValue() + 1);
			this.minutes = new MInteger(0);
		}
	}

	public void finalize() throws Throwable {

	}

	public DegreesInteger getDegrees() {
		APosition.trace(MMarker.GETTER,"Getting Degrees: {}",degrees);
		return degrees;
	}

	public MInteger getMinutes() {
		APosition.trace(MMarker.GETTER,"Getting Minutes: {}",minutes);
		return minutes;
	}

	public MFloat getSeconds() {
		APosition.trace(MMarker.GETTER,"Getting Seconds: {}",seconds);
		return seconds;
	}

	public MFloat getDMS() {
		APosition.trace(MMarker.GETTER,"Getting DMS: {}",dms);
		return dms;
	}

	public MString toJSON() {
		APosition.trace(MMarker.JSONSERIALIZATION,"Getting JSON serialization");
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
	
}
