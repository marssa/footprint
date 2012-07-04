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
package org.marssa.footprint.datatypes.decimal.temperature;

import static javax.measure.unit.NonSI.FAHRENHEIT;
import static javax.measure.unit.SI.CELSIUS;
import static javax.measure.unit.SI.KELVIN;

import java.math.MathContext;

import javax.measure.quantity.Temperature;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.datatypes.decimal.MDecimal;
import org.marssa.footprint.exceptions.OutOfRange;
import org.marssa.footprint.logger.MMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ATemperature", factoryClass = TypeFactory.class, factoryMethod = "getATemperatureInstance")
public abstract class ATemperature extends MDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2193594527442130594L;

	private static Logger logger = LoggerFactory.getLogger(Kelvin.class
			.getName());

	private final Unit<Temperature> currentUnit;

	protected ATemperature(double value, Unit<Temperature> unit) {
		super(value);
		this.currentUnit = unit;
	}

	protected ATemperature(double value, Unit<Temperature> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}

	public MDecimal getDegreesCelcius() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(CELSIUS)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to DegreesCelcius : {}", currentUnit,
				result);
		return result;
	}

	public MDecimal getFahrenheit() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(FAHRENHEIT)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Fahrenheit : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	public MDecimal getKelvin() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KELVIN)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Fahrenheit : {}",
				currentUnit, result);
		return result;
	}

}
