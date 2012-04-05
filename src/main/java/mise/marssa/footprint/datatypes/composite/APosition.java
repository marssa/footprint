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
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.logger.MMarker;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.GenericGenerator;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @author Warren Zahra
 * @author Clayton Tabone
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@MappedSuperclass
@XmlType(name = "APosition", factoryClass = TypeFactory.class, factoryMethod = "getAPositionInstance")
public abstract class APosition {
	protected APosition() {
	}

	private static Logger APosition = (Logger) LoggerFactory
			.getLogger("APosition");
	// TODO Remove one of the internal representations

	public DegreesInteger deg;
	public MInteger min;
	public MFloat sec;
	public DegreesFloat dms;

	private Long id;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public APosition(DegreesInteger degrees, MInteger minutes, MFloat seconds) {
		this.deg = degrees;
		this.min = minutes;
		this.sec = seconds;
		Object[] aPosition = { degrees, minutes, seconds };
		// APosition.trace(MMarker.CONSTRUCTOR,"Constructor created with  Degrees:\"{}\", Minutes:\"{}\",Seconds:\"{}\" ",
		// aPosition);
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
		// APosition.trace(MMarker.CONSTRUCTOR,"Constructor created with  Degrees:\"{}f\".",
		// degrees);
		float degFloat = degrees.getValue();
		this.dms = degrees;
		this.deg = new DegreesInteger((int) java.lang.Math.floor(degFloat));

		float minFloat = 60 * java.lang.Math
				.abs(degFloat - this.deg.getValue());
		this.min = new MInteger((int) minFloat);

		float secFloat = 60 * (minFloat - this.min.getValue());
		if (secFloat == 60) {
			this.min = new MInteger(this.min.getValue() + 1);
			secFloat = 0;
		}
		this.sec = new MFloat(secFloat);
		if (this.min.getValue() == 60) {
			this.deg = new DegreesInteger(this.deg.getValue() + 1);
			this.min = new MInteger(0);
		}
	}

	public void finalize() throws Throwable {

	}

	@ManyToOne
	@Cascade({ CascadeType.SAVE_UPDATE })
	public DegreesInteger getDegrees() {
		APosition.trace(MMarker.GETTER, "Getting Degrees: {}", deg);
		return deg;
	}

	public void setDegrees(DegreesInteger degrees) {
		this.deg = degrees;
	}

	@ManyToOne
	@Cascade({ CascadeType.SAVE_UPDATE })
	public MInteger getMinutes() {
		APosition.trace(MMarker.GETTER, "Getting Minutes: {}", min);
		return min;
	}

	public void setMinutes(MInteger minutes) {
		this.min = minutes;
	}

	@ManyToOne
	@Cascade({ CascadeType.SAVE_UPDATE })
	public MFloat getSeconds() {
		APosition.trace(MMarker.GETTER, "Getting Seconds: {}", sec);
		return sec;
	}

	public void setSeconds(MFloat seconds) {
		this.sec = seconds;
	}

	@ManyToOne
	@Cascade({ CascadeType.SAVE_UPDATE })
	public DegreesFloat getDMS() {
		APosition.trace(MMarker.GETTER, "Getting DMS: {}", dms);
		return dms;
	}

	public void setDMS(DegreesFloat dms) {
		this.dms = dms;
	}

	public MString toJSON() {
		APosition
				.trace(MMarker.JSONSERIALIZATION, "Getting JSON serialization");
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}

}
