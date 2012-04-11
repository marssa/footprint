/**
 * Copyright 2012 MARSEC-XL International Limited
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

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Ah", factoryClass = TypeFactory.class, factoryMethod = "getAhInstance")
@Entity
public class Ah extends ACharge {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2429740367288761749L;

	public Ah(double value) {
		super(value, AMPERE_HOUR);
	}
}
