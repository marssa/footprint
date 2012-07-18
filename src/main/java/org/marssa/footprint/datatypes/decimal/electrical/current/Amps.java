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
package org.marssa.footprint.datatypes.decimal.electrical.current;

import static javax.measure.unit.SI.AMPERE;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Amps")
@Entity
@ForeignKey(name = "FK_Amps_MDecimal")
public class Amps extends ACurrent {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2475524880324813478L;

	private Amps() {
		super(0.0, AMPERE);
	}

	public Amps(double value) {
		super(value, AMPERE);
	}

	public Amps(double value, MathContext mc) throws OutOfRange {
		super(value, AMPERE, mc);

	}

}
