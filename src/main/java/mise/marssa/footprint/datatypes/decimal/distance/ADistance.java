/**
 * Copyright 2012 MARSEC-XL Foundation
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
package mise.marssa.footprint.datatypes.decimal.distance;

import static javax.measure.unit.NonSI.MILE;
import static javax.measure.unit.NonSI.NAUTICAL_MILE;
import static javax.measure.unit.SI.KILOMETRE;
import static javax.measure.unit.SI.METRE;

import javax.measure.converter.MultiplyConverter;
import javax.measure.quantity.Length;
import javax.measure.unit.Unit;
import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.decimal.UnsignedDecimal;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ADistance", factoryClass = TypeFactory.class, factoryMethod = "getADistanceInstance")
@MappedSuperclass
public abstract class ADistance extends UnsignedDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4513355674275769229L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(ADistance.class.getName());

	private Unit<Length> currentUnit;

	/**
	 * Scale required to convert from Coulombs to milli Ampere hours
	 */
	private static final MultiplyConverter metresToFathoms = new MultiplyConverter(
			0.5468);

	/**
	 * Fathom unit
	 * 
	 * @see javax.measure.quantity.Length
	 */
	protected static final Unit<Length> FATHOM = METRE
			.transform(metresToFathoms);

	public ADistance(double value, Unit<Length> unit) throws OutOfRange {
		super(value);
		this.currentUnit = unit;
	}

	public MDecimal getKM() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILOMETRE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Kilometres : {}",
				currentUnit, result);
		return result;
	}

	@Column(name = "Metres")
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
	 * @return
	 */
	public MDecimal getFathoms() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(FATHOM)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Fathoms : {}",
				currentUnit, result);
		return result;
	}

	@Override
	public String toString() {
		return "Distance in " + this.getClass().getSimpleName() + " = "
				+ super.toString();
	}
}
