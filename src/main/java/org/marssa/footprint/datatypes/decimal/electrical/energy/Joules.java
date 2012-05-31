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
package org.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Warren Zahra
 * 
 */
@XmlType(name = "Joules")
@Entity
@ForeignKey(name = "FK_Joules_MDecimal")
public class Joules extends AEnergy {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3877832712821844379L;

	private Joules() {
		super(0, JOULE);
	}

	public Joules(double value) {
		super(value, JOULE);
	}

	public Joules(double value, MathContext mc) throws OutOfRange {
		super(value, JOULE, mc);
	}
}
