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
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

import static javax.measure.unit.SI.COULOMB;

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
@XmlType(name = "Coulombs", factoryClass = TypeFactory.class, factoryMethod = "getCoulombsInstance")
@Entity
@ForeignKey(name = "FK_Coulombs_MDecimal")
public class Coulombs extends ACharge {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2570753972423764454L;

	public Coulombs(double value) {
		super(value, COULOMB);
	}
	
	public Coulombs(double value, MathContext mc) throws OutOfRange {
		super(value, COULOMB, mc);
	}
}
