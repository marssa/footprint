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
package mise.marssa.footprint.datatypes.decimal.pressure;

import static javax.measure.unit.NonSI.BAR;
import static javax.measure.unit.SI.MILLI;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.hibernate.annotations.AccessType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * milli bars
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MBars", factoryClass = TypeFactory.class, factoryMethod = "getMBarsInstance")
@Entity
@AccessType("property")
public class MBars extends APressure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4424568284706157637L;

	public MBars(double value) throws OutOfRange {
		super(value, MILLI(BAR));
	}
	@Column(name = "Mbars")
	public double getValue(){
		return super.doubleValue();
	}
}
