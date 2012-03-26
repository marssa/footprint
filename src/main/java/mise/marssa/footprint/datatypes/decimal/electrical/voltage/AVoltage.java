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

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

/**
 * @author Lifebook
 *
 */
@XmlType(name = "AVoltage", factoryClass = TypeFactory.class, factoryMethod = "getAVoltageInstance")
public abstract class AVoltage extends MFloat {
	public AVoltage (float value) {
		super(value);
	}
	
	abstract public float getVolts();
	abstract public float getMilliVolts();
	
	@Override
	public String toString() {
		return "Voltage in " + this.getClass().getSimpleName() + " = " + value;
	}
}

