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
package org.marssa.footprint.datatypes.decimal.flow;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.ForeignKey;
import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * Cubic feet per second
 * 
 * @author Alan Grech
 */
@XmlType(name = "CFPS", factoryClass = TypeFactory.class, factoryMethod = "getCFPSInstance")
@Entity
@ForeignKey(name = "FK_CFPS_MDecimal")
public class CFPS extends AVolumeFlow {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8791102456335842037L;

	public CFPS(double value) throws OutOfRange {
		super(value, CUBIC_FEET_PER_SECOND);
	}
	public CFPS(double value, MathContext mc) throws OutOfRange {
		super(value, CUBIC_FEET_PER_SECOND, mc);
	}
}
