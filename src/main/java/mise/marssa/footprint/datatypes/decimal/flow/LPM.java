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

import java.math.MathContext;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

import org.hibernate.annotations.ForeignKey;

/**
 * Litres per minute
 * 
 * @author Alan Grech
 */
@XmlType(name = "LPM", factoryClass = TypeFactory.class, factoryMethod = "getLPMInstance")
@Entity
@ForeignKey(name = "FK_LPM_MDecimal")
public class LPM extends AVolumeFlow {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7889320345172464758L;

	public LPM(double value) throws OutOfRange {
		super(value, LITRES_PER_MINUTE);
	}
	public LPM(double value, MathContext mc) throws OutOfRange {
		super(value, LITRES_PER_MINUTE, mc);
	}
}
