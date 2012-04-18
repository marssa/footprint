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
package mise.marssa.footprint.datatypes.decimal.frequency;

import static javax.measure.unit.SI.HERTZ;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

import org.hibernate.annotations.ForeignKey;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Hz", factoryClass = TypeFactory.class, factoryMethod = "getHzInstance")
@Entity
@ForeignKey(name = "FK_Hz_MDecimal")
public class Hz extends AFrequency {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3711408958469426590L;

	public Hz(double value) throws OutOfRange {
		super(value, HERTZ);
	}
	public Hz(double value, MathContext mc) throws OutOfRange {
		super(value, HERTZ, mc);
	}
}
