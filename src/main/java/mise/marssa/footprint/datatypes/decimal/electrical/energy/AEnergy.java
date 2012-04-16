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
import static javax.measure.unit.SI.MILLI;
import static javax.measure.unit.SI.MEGA;

import javax.measure.quantity.ElectricCurrent;
import javax.measure.quantity.Energy;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "AEnergy", factoryClass = TypeFactory.class, factoryMethod = "getAEnergyInstance")
public abstract class AEnergy extends MDecimal {


	private static Logger logger = (Logger) LoggerFactory
			.getLogger(AEnergy.class.getName());

	private Unit<Energy> energyUnit;

	protected AEnergy(double value, Unit<Energy> unit) {
		super(value);
		this.energyUnit = unit;
	}

	public MDecimal getJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(JOULE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Amps : {}",
				energyUnit, result);
		return result;
	}

	public MDecimal getKJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(KILO(JOULE)).convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				energyUnit, result);
		return result;
	}
	
	
	
	public MDecimal getMJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(MEGA(JOULE)).convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				energyUnit, result);
		return result;
	}

	
}
