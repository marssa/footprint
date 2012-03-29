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
package mise.marssa.footprint.datatypes.decimal.distance;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Kilometres
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:20
 */
@XmlType(name = "KM", factoryClass = TypeFactory.class, factoryMethod = "getKMInstance")
@Entity
public class KM extends ADistance {

	private static Logger Km = (Logger) LoggerFactory.getLogger("Km");

	
	public KM(float value) throws OutOfRange {
		super(value);
	}
	
	
	@Override
	public float getKM() {
		Km.trace(MMarker.GETTER,"Getting Km: {}",value);
		return this.value;
	}

	@Override
	public float getMetres() {
		Km.trace(MMarker.GETTER,"Converting from Km to Metres : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getMiles() {
		Km.trace(MMarker.GETTER,"Converting from Km to Miles : {}",value * (float) 0.621371192);
		return value * (float) 0.621371192;
	}

	@Override
	public float getNM() {
		Km.trace(MMarker.GETTER,"Converting from Km to NMiles : {}",value * (float) 0.539956);
		return value * (float) 0.539956;
	}

	@Override
	public float getFathoms() {
		Km.trace(MMarker.GETTER,"Converting from Km to Fathoms : {}",value * (float) 546.806649);
		return value * (float) 546.806649;
	}
	
	
}
