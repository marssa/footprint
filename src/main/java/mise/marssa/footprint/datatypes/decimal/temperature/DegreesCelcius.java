/**
 * Copyright 2012 MARSEC-XL Foundation
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
package mise.marssa.footprint.datatypes.decimal.temperature;

import static javax.measure.unit.SI.CELSIUS;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.AccessType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesCelcius", factoryClass = TypeFactory.class, factoryMethod = "getDegreesCelciusInstance")
@Entity
@AccessType("property")
public class DegreesCelcius extends ATemperature {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6389649969115417896L;

	public DegreesCelcius(double value) {
		super(value, CELSIUS);
	}
	@Column(name = "DegreesCelcius")
	public double getValue(){
		return super.doubleValue();
	}
}
