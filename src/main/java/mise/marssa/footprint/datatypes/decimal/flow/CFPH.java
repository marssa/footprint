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

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Cubic feet per hour
 * 
 * @author Alan Grech
 */
@XmlType(name = "CFPH", factoryClass = TypeFactory.class, factoryMethod = "getCFPHInstance")
public class CFPH extends AVolumeFlow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4566317352961219131L;

	public CFPH(double value) throws OutOfRange {
		super(value, CUBIC_FEET_PER_HOUR);
	}
}
