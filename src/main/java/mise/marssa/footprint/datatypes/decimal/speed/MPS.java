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
package mise.marssa.footprint.datatypes.decimal.speed;

import static javax.measure.unit.SI.METERS_PER_SECOND;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Meters per Second
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 * 
 * 
 */

@XmlType(name = "MPS", factoryClass = TypeFactory.class, factoryMethod = "getMPSInstance")
@Entity
public class MPS extends ASpeed {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6403670007216732140L;

	public MPS(double value) throws OutOfRange {
		super(value, METERS_PER_SECOND);
	}
}
