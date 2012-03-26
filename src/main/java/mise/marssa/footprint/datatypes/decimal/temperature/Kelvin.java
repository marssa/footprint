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
package mise.marssa.footprint.datatypes.decimal.temperature;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Kelvin", factoryClass = TypeFactory.class, factoryMethod = "getKelvinInstance")
@Entity
public class Kelvin extends ATemperature {

	private static Logger Kelvin = (Logger) LoggerFactory.getLogger("Kelvin");

	public Kelvin(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		Kelvin.trace(MMarker.GETTER,"Converting from Kelvin to DegreesCelcius : {}",value - 273);
		return value - 273;
	}

	@Override
	public float getFahrenheit() {
		Kelvin.trace(MMarker.GETTER,"Converting from Kelvin to Fahrenheit : {}",((value - 273) * 9 / 5) + 32);
		return ((value - 273) * 9 / 5) + 32;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		Kelvin.trace(MMarker.GETTER,"Getting Kelvin: {}",value);
		return value;
	}
}
