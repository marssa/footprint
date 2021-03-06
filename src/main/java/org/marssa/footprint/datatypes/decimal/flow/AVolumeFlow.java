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
package org.marssa.footprint.datatypes.decimal.flow;

import static javax.measure.unit.NonSI.FOOT;
import static javax.measure.unit.NonSI.HOUR;
import static javax.measure.unit.NonSI.LITRE;
import static javax.measure.unit.NonSI.MINUTE;
import static javax.measure.unit.SI.CUBIC_METRE;
import static javax.measure.unit.SI.SECOND;

import java.math.MathContext;

import javax.measure.quantity.VolumetricFlowRate;
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
 * @author Alan Grech
 * 
 */
@XmlType(name = "AVolumeFlow", factoryClass = TypeFactory.class, factoryMethod = "getAVolumeFlowInstance")
public abstract class AVolumeFlow extends UnsignedDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3235041450565348369L;

	private static final Logger logger =  LoggerFactory
			.getLogger(AVolumeFlow.class.getName());

	private Unit<VolumetricFlowRate> currentUnit;

	/**
	 * Cubic metres per second (m&sup3;/s)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_METRE_PER_SECOND = CUBIC_METRE
			.divide(SECOND).asType(VolumetricFlowRate.class);

	/**
	 * Cubic metres per minute (m&sup3;/min)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_METRE_PER_MINUTE = CUBIC_METRE
			.divide(MINUTE).asType(VolumetricFlowRate.class);

	/**
	 * Cubic metres per hour (m&sup3;/hr)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_METRE_PER_HOUR = CUBIC_METRE
			.divide(HOUR).asType(VolumetricFlowRate.class);

	/**
	 * Litres per second (lt/s)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> LITRES_PER_SECOND = LITRE
			.divide(SECOND).asType(VolumetricFlowRate.class);

	/**
	 * Litres per minute (lt/min)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> LITRES_PER_MINUTE = LITRE
			.divide(MINUTE).asType(VolumetricFlowRate.class);

	/**
	 * Litres per hour (lt/hr)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> LITRES_PER_HOUR = LITRE
			.divide(HOUR).asType(VolumetricFlowRate.class);

	/**
	 * Cubic feet per second (ft&sup3;/s)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_FEET_PER_SECOND = (FOOT
			.times(FOOT).times(FOOT)).divide(SECOND).asType(
			VolumetricFlowRate.class);

	/**
	 * Cubic feet per minute (ft&sup3;/min)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_FEET_PER_MINUTE = (FOOT
			.times(FOOT).times(FOOT)).divide(MINUTE).asType(
			VolumetricFlowRate.class);

	/**
	 * Cubic feet per hour (ft&sup3;/hr)
	 * 
	 * @see javax.measure.quantity.VolumetricFlowRate
	 */
	protected static final Unit<VolumetricFlowRate> CUBIC_FEET_PER_HOUR = (FOOT
			.times(FOOT).times(FOOT)).divide(HOUR).asType(
			VolumetricFlowRate.class);

	protected AVolumeFlow(Unit<VolumetricFlowRate> unit) {
		super();
		this.currentUnit = unit;
	}

	protected AVolumeFlow(double value, Unit<VolumetricFlowRate> unit)
			throws OutOfRange {
		super(value);
		this.currentUnit = unit;
	}

	protected AVolumeFlow(double value, Unit<VolumetricFlowRate> unit,
			MathContext mc) throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}

	/**
	 * Litres per hour (lt/hr)
	 * 
	 * @return
	 */
	public MDecimal getLPH() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				LITRES_PER_HOUR).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Litres per hour : {}", currentUnit,
				result);
		return result;
	}

	/**
	 * Litres per minute (lt/min)
	 * 
	 * @return
	 */
	public MDecimal getLPM() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				LITRES_PER_MINUTE).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Litres per minute : {}", currentUnit,
				result);
		return result;
	}

	/**
	 * Litres per second (lt/s)
	 * 
	 * @return
	 */
	public MDecimal getLPS() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				LITRES_PER_HOUR).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Litres per second : {}", currentUnit,
				result);
		return result;
	}

	/**
	 * Meters cubed per second (m&sup3;/s)
	 * 
	 * @return
	 */
	public MDecimal getMCPS() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_METRE_PER_SECOND).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic metres per second : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Meters cubed per minute (m&sup3;/min)
	 * 
	 * @return
	 */
	public MDecimal getMCPM() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_METRE_PER_MINUTE).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic metres per minute : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Meters cuber per hour (m&sup3;/hr)
	 * 
	 * @return
	 */
	public MDecimal getMCPH() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_METRE_PER_HOUR).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic metres per hour : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Cubic foot per second (ft&sup3;/s)
	 * 
	 * @return
	 */
	public MDecimal getCFPS() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_FEET_PER_SECOND).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic feet per second : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Cubic foot per minute (ft&sup3;/min)
	 * 
	 * @return
	 */
	public MDecimal getCFPM() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_FEET_PER_MINUTE).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic feet per minute : {}",
				currentUnit, result);
		return result;
	}

	/**
	 * Cubic foot per hour (ft&sup3;/hr)
	 * 
	 * @return
	 */
	public MDecimal getCFPH() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				CUBIC_FEET_PER_HOUR).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Cubic feet per hour : {}", currentUnit,
				result);
		return result;
	}

	// TODO US & UK gallons

}
