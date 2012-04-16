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

import static javax.measure.unit.NonSI.HOUR;
import static javax.measure.unit.SI.AMPERE;
import static javax.measure.unit.SI.COULOMB;
import static javax.measure.unit.SI.MILLI;

import javax.measure.quantity.ElectricCharge;
import javax.measure.unit.Unit;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "ACharge", factoryClass = TypeFactory.class, factoryMethod = "getAChargeInstance")
@MappedSuperclass
public abstract class ACharge extends MDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -750203926399246080L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(ACharge.class.getName());

	private Unit<ElectricCharge> currentUnit;

	/**
	 * Ampere-hour unit
	 * 
	 * @see javax.measure.quantity.ElectricCharge
	 */
	protected static final Unit<ElectricCharge> AMPERE_HOUR = AMPERE
			.times(HOUR).asType(ElectricCharge.class);

	/**
	 * Milli Ampere-hour unit
	 * 
	 * @see javax.measure.quantity.ElectricCharge
	 */
	protected static final Unit<ElectricCharge> MILLI_AMPERE_HOUR = MILLI(
			AMPERE).times(HOUR).asType(ElectricCharge.class);

	protected ACharge(double value, Unit<ElectricCharge> unit) {
		super(value);
		this.currentUnit = unit;
	}

	/**
	 * Ampere-hours
	 * 
	 * @return
	 */
	public MDecimal getAh() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(AMPERE_HOUR)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Ampere hours : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Milli Ampere-hours
	 * 
	 * @return
	 */
	public MDecimal getmAh() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				MILLI_AMPERE_HOUR).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to milli Ampere hours : {}", currentUnit,
				result);
		return result;
	}

	public MDecimal getCoulombs() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(COULOMB)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Coulombs : {}",
				currentUnit, result);
		return result;
	}

}
