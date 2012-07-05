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
package org.marssa.footprint.datatypes.decimal.distance;

import static javax.measure.unit.NonSI.MILE;
import static javax.measure.unit.NonSI.NAUTICAL_MILE;
import static javax.measure.unit.SI.KILOMETRE;
import static javax.measure.unit.SI.METRE;

import java.math.MathContext;

import javax.measure.converter.MultiplyConverter;
import javax.measure.quantity.Length;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import org.marssa.footprint.datatypes.TypeFactory;
import org.marssa.footprint.datatypes.decimal.MDecimal;
import org.marssa.footprint.datatypes.decimal.UnsignedDecimal;
import org.marssa.footprint.exceptions.OutOfRange;
import org.marssa.footprint.logger.MMarker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ADistance", factoryClass = TypeFactory.class, factoryMethod = "getADistanceInstance")
public abstract class ADistance extends UnsignedDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4513355674275769229L;

	private static Logger logger = LoggerFactory.getLogger(ADistance.class
			.getName());

	private final Unit<Length> currentUnit;

	/**
	 * Scale required to convert from Coulombs to milli Ampere hours
	 */
	private static final MultiplyConverter metresToFathoms = new MultiplyConverter(
			1.8288);

	/**
	 * Fathom unit
	 * 
	 * @see javax.measure.quantity.Length
	 */
	protected static final Unit<Length> FATHOM = METRE
			.transform(metresToFathoms);

	protected ADistance(double value, Unit<Length> unit) throws OutOfRange {
		super(value);
		this.currentUnit = unit;
	}

	protected ADistance(double value, Unit<Length> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}

	public MDecimal getKM() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILOMETRE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Kilometres : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMetres() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(METRE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to metres : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMiles() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(MILE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Miles : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getNM() {
		MDecimal result = new MDecimal(currentUnit
				.getConverterTo(NAUTICAL_MILE).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Nautical Miles : {}", currentUnit,
				result);
		return result;
	}

	/**
	 * A fathom (abbreviation: ftm) is a unit of length in the imperial and the
	 * U.S. customary systems, used especially for measuring the depth of water.
	 * 
	 * @return The value converted from the current unit to Fathoms
	 */
	public MDecimal getFathoms() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(FATHOM)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Fathoms : {}",
				currentUnit, result);
		return result;
	}
}
