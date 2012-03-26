/*******************************************************************************
 * Copyright 2012 Marsec-XL Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.voltage;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Volts", factoryClass = TypeFactory.class, factoryMethod = "getVoltsInstance")
@Entity
public class Volts extends AVoltage {

	private static Logger Volts = (Logger) LoggerFactory.getLogger("Volts");

	public Volts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		Volts.trace(MMarker.GETTER,"Getting Volts: {}",value);
		return value;
	}

	@Override
	public float getMilliVolts() {
		Volts.trace(MMarker.GETTER,"Converting from Volts to MilliVolts : {}",value * 1000f);
		return value * 1000f;
	}
}
