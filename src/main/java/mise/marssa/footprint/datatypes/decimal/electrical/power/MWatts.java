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
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import static javax.measure.unit.SI.MEGA;
import static javax.measure.unit.SI.WATT;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

import org.hibernate.annotations.ForeignKey;

/**
 * Mega Watts
 * 
 * @author Warren Zahra
 */
@XmlType(name = "MWatts", factoryClass = TypeFactory.class, factoryMethod = "getMWattsInstance")
@Entity
@ForeignKey(name = "FK_MWatts_MDecimal")
public class MWatts extends APower {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2208075757592899929L;

	public MWatts(double value) {
		super(value, MEGA(WATT));
	}
	public MWatts(double value, MathContext mc) throws OutOfRange {
		super(value, MEGA(WATT), mc);
	}
}
