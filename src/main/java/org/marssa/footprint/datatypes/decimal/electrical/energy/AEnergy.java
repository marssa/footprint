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
package org.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;
import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.MEGA;

import java.math.MathContext;

import javax.measure.quantity.Energy;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;


import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.datatypes.decimal.MDecimal;
import org.marssa.footprint.exceptions.OutOfRange;
import org.marssa.footprint.logger.MMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Warren Zahra
 * 
 */
@XmlType(name = "AEnergy", factoryClass = TypeFactory.class, factoryMethod = "getAEnergyInstance")

public abstract class AEnergy extends MDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3759688687362547165L;

	private static Logger logger =  LoggerFactory
			.getLogger(AEnergy.class.getName());

	private Unit<Energy> currentUnit;

	protected AEnergy(double value, Unit<Energy> unit) {
		super(value);
		this.currentUnit = unit;
	}
	
	protected AEnergy(double value, Unit<Energy> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}

	public MDecimal getJoules() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(JOULE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Amps : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getKJoules() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILO(JOULE))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMJoules() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(MEGA(JOULE))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				currentUnit, result);
		return result;
	}

}
