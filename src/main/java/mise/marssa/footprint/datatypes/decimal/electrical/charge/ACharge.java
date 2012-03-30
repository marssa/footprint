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
/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "ACharge", factoryClass = TypeFactory.class, factoryMethod = "getAChargeInstance")
public abstract class ACharge extends MFloat {

	public ACharge(float value) {
		super(value);
	}
	
	/**
	 * Ampere-hours
	 * @return
	 */
	abstract public float getAh();
	
	/**
	 * Milli Ampere-hours
	 * @return
	 */
	abstract public float getmAh();
	
	abstract public float getColoumbs();
	
	@Override
	public String toString() {
		return "Charge in " + this.getClass().getSimpleName() + " = " + value;
	}
}
