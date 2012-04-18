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
package mise.marssa.footprint.datatypes.decimal.electrical.voltage;

import static javax.measure.unit.SI.VOLT;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

import org.hibernate.annotations.ForeignKey;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Volts", factoryClass = TypeFactory.class, factoryMethod = "getVoltsInstance")
@Entity
@ForeignKey(name = "FK_Metres_MDecimal")
public class Volts extends AVoltage {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8894596403864032413L;

	public Volts(double value) {
		super(value, VOLT);
	}
	public Volts(double value, MathContext mc) throws OutOfRange {
		super(value, VOLT, mc);
	}
}
