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
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.MEGA;
import static javax.measure.unit.SI.OHM;

import java.math.MathContext;

import javax.measure.quantity.ElectricResistance;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Warren Zahra
 * 
 */
@XmlType(name = "AImpedance", factoryClass = TypeFactory.class, factoryMethod = "getAImpedanceInstance")

public abstract class AImpedance extends MDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -1953431603172098092L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(AImpedance.class.getName());

	private Unit<ElectricResistance> currentUnit;

	protected AImpedance(double value, Unit<ElectricResistance> unit) {
		super(value);
		this.currentUnit = unit;
	}

	protected AImpedance(double value, Unit<ElectricResistance> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}
	
	public MDecimal getOhms() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(OHM).convert(
				doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Ohms : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getKOhms() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILO(OHM))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Kilo Ohms : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMOhms() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(MEGA(OHM))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Mega Ohms : {}",
				currentUnit, result);
		return result;
	}


}
