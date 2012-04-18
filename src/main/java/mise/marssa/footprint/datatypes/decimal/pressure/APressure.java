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
import static javax.measure.unit.NonSI.INCH;
import static javax.measure.unit.NonSI.MILLIMETER_OF_MERCURY;
import static javax.measure.unit.NonSI.POUND;
import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.MILLI;
import static javax.measure.unit.SI.PASCAL;

import java.math.MathContext;

import javax.measure.quantity.Pressure;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.decimal.UnsignedDecimal;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */

@XmlType(name = "APressure", factoryClass = TypeFactory.class, factoryMethod = "getAPressureInstance")

public abstract class APressure extends UnsignedDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3126239243549374073L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(APressure.class.getName());

	private Unit<Pressure> currentUnit;

	/**
	 * Pounds per square Inch unit
	 * 
	 * @see javax.measure.quantity.Pressure
	 */
	protected static final Unit<Pressure> PSI = POUND.divide(INCH.times(INCH))
			.asType(Pressure.class);

	protected APressure(double value, Unit<Pressure> unit) throws OutOfRange {
		super(value);
		this.currentUnit = unit;
	}

	protected APressure(double value, Unit<Pressure> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}
	public MDecimal getBars() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(BAR).convert(
				doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Bars : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * get millibars
	 */
	public MDecimal getMBars() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(MILLI(BAR))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Bars : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	public MDecimal getPa() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(PASCAL)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Pascals : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * get Kilo Pascals
	 * 
	 * @return
	 */
	public MDecimal getKPa() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILO(PASCAL))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Kilo Pascals : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * get millimetres Mercury
	 */
	public MDecimal getMMHg() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				MILLIMETER_OF_MERCURY).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to millimetres of Mecrcury : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getPSI() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(PSI).convert(
				doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Pounds per square Inch : {}",
				currentUnit, result);
		return result;
	}

	
}
