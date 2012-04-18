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
package mise.marssa.footprint.datatypes.decimal.speed;

import static javax.measure.unit.NonSI.KILOMETERS_PER_HOUR;

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

import org.hibernate.annotations.ForeignKey;

/**
 * Kilometres per hour
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */

@XmlType(name = "KPH", factoryClass = TypeFactory.class, factoryMethod = "getKPHInstance")
@Entity
@ForeignKey(name = "FK_KPH_MDecimal")
public class KPH extends ASpeed {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5468343418492237042L;

	public KPH(double value) throws OutOfRange {
		super(value, KILOMETERS_PER_HOUR);
	}
	public KPH(double value, MathContext mc) throws OutOfRange {
		super(value, KILOMETERS_PER_HOUR, mc);
	}
}
