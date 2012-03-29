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
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "APower", factoryClass = TypeFactory.class, factoryMethod = "getAPowerInstance")
public abstract class APower extends MFloat {
	public APower (float value) {
		super(value);
	}
	
	abstract public float getWatts();
	abstract public float getKWatts();
	abstract public float getMWatts();
	
	@Override
	public String toString() {
		return "Power in " + this.getClass().getSimpleName() + " = " + value;
	}
}
