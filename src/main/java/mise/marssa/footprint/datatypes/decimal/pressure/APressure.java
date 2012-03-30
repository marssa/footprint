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
package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */

@XmlType(name = "APressure", factoryClass = TypeFactory.class, factoryMethod = "getAPressureInstance")
public abstract class APressure extends UnsignedFloat {

	public APressure(float value) throws OutOfRange {
		super(value);
	}
	
	abstract public float getBars();

	/**
	 * get Millibars
	 */
	abstract public float getMBars();

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	abstract public float getPa();
	
	abstract public float getKPa(); //Kilo Pascals
	
	/**
	 * get Millimetres Mercury;
	 */
	abstract public float getMMHg();
	
	abstract public float getPSI();
	
	@Override
	public String toString() {
		return "Pressure in " + this.getClass().getSimpleName() + " = " + value;
	}
}
