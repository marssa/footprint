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

import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.WATT;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Warren Zahra
 * 
 */
@XmlType(name = "KWatts", factoryClass = TypeFactory.class, factoryMethod = "getKWattsInstance")
@Entity
public class KWatts extends APower {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4803340047969866158L;

	public KWatts(double value) {
		super(value, KILO(WATT));
	}
}
