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

import static javax.measure.unit.SI.CELSIUS;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesCelcius")
@Entity
@ForeignKey(name = "FK_DegreesCelcius_MDecimal")
public class DegreesCelcius extends ATemperature {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6389649969115417896L;

	private DegreesCelcius() {
		super(0.0, CELSIUS);
	}

	public DegreesCelcius(double value) {
		super(value, CELSIUS);
	}

	public DegreesCelcius(double value, MathContext mc) throws OutOfRange {
		super(value, CELSIUS, mc);
	}
}
