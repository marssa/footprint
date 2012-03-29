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


import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Lifebook
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ADistance", factoryClass = TypeFactory.class, factoryMethod = "getADistanceInstance")
@MappedSuperclass
public abstract class ADistance extends UnsignedFloat {

	public ADistance(float value) throws OutOfRange {
		super(value);
	}
	
	
	
	abstract public float getKM();

	abstract public float getMetres();

	abstract public float getMiles();

	abstract public float getNM();
	
	/**
	 * A fathom (abbreviation: ftm) is a unit of length in the imperial and the U.S. customary systems, used especially for measuring the depth of water.
	 * @return
	 */
	abstract public float getFathoms();
	
	@Override
	public String toString() {
		return "Distance in " + this.getClass().getSimpleName() + " = " + value;
	}
}
