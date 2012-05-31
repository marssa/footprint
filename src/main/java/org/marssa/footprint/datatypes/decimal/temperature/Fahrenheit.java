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
package org.marssa.footprint.datatypes.decimal.temperature;

import static javax.measure.unit.NonSI.FAHRENHEIT;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Fahrenheit", factoryClass = TypeFactory.class, factoryMethod = "getFahrenheitInstance")
@Entity
@ForeignKey(name = "FK_Fahrenheit_MDecimal")
public class Fahrenheit extends ATemperature {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3147375086611852458L;

	public Fahrenheit(double value) {
		super(value, FAHRENHEIT);
	}
	public Fahrenheit(double value, MathContext mc) throws OutOfRange {
		super(value, FAHRENHEIT, mc);
	}
}
