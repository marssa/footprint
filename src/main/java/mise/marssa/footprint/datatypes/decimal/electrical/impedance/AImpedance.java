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
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "AImpedance", factoryClass = TypeFactory.class, factoryMethod = "getAImpedanceInstance")
public abstract class AImpedance extends MFloat {
	public AImpedance (float value) {
		super(value);
	}
	
	abstract public float getOhms();
	abstract public float getKOhms();
	abstract public float getMOhms();

	@Override
	public String toString() {
		return "Impedance in " + this.getClass().getSimpleName() + " = " + value;
	}
}
