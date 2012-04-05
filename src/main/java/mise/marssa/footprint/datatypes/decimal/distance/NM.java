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

import static javax.measure.unit.NonSI.NAUTICAL_MILE;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Nautical Miles - most widely used as distance measurement in nautical terms
 * This datatype shall be used for depths as well
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:23
 */
@XmlType(name = "Nm", factoryClass = TypeFactory.class, factoryMethod = "getNmInstance")
@Entity
public class NM extends ADistance {

	/**
	 * 
	 */
	private static final long serialVersionUID = -720317946108978578L;

	public NM(double value) throws OutOfRange {
		super(value, NAUTICAL_MILE);
	}
}
