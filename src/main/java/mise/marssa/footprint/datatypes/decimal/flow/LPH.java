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
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.AccessType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Litres per hour
 * 
 * @author Alan Grech
 */
@XmlType(name = "LPH", factoryClass = TypeFactory.class, factoryMethod = "getLPHInstance")
@Entity
@AccessType("property")
public class LPH extends AVolumeFlow {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4461824473313039994L;

	public LPH(double value) throws OutOfRange {
		super(value, LITRES_PER_HOUR);
	}
	@Column(name = "LPH")
	public double getValue(){
		return super.doubleValue();
	}
}
