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
import static javax.measure.unit.SI.MEGA;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "MJoules", factoryClass = TypeFactory.class, factoryMethod = "getMJoulesInstance")
@Entity
@ForeignKey(name = "FK_Metres_MDecimal")
public class MJoules extends AEnergy {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6549821865763682896L;

	public MJoules(double value) {
		super(value, MEGA(JOULE));
	}
	
	public MJoules(double value, MathContext mc) throws OutOfRange {
		super(value, MEGA(JOULE), mc);
	}
}
