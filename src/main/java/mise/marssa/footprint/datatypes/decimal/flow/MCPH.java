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
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech conversions for cubic metres per hour
 */
@XmlType(name = "MCPH", factoryClass = TypeFactory.class, factoryMethod = "getMCPHInstance")
@Entity
public class MCPH extends AVolumeFlow {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1986692881386825103L;

	public MCPH(double value) throws OutOfRange {
		super(value, CUBIC_METRE_PER_HOUR);
	}
}
