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
package mise.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;
import static javax.measure.unit.SI.KILO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

import org.hibernate.annotations.AccessType;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "KJoules", factoryClass = TypeFactory.class, factoryMethod = "getKJoulesInstance")
@Entity
@AccessType("property")
public class KJoules extends AEnergy {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3775759578719733137L;

	public KJoules(double value) {
		super(value, KILO(JOULE));
	}
	
	@Column(name = "KJoules")
	public double getValue(){
		return super.doubleValue();
	}
}