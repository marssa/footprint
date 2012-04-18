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
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.footprint.datatypes.decimal.volume;

import static javax.measure.unit.NonSI.GALLON_DRY_US;
import static javax.measure.unit.NonSI.GALLON_LIQUID_US;
import static javax.measure.unit.NonSI.GALLON_UK;
import static javax.measure.unit.NonSI.LITRE;

import java.math.MathContext;

import javax.measure.quantity.Volume;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.decimal.UnsignedDecimal;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@XmlType(name = "AVolume", factoryClass = TypeFactory.class, factoryMethod = "getAVolumeInstance")

public abstract class AVolume extends UnsignedDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5927631230519898723L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(AVolume.class.getName());

	private Unit<Volume> currentUnit;

	protected AVolume(double value, Unit<Volume> unit) throws OutOfRange {
		super(value);
	}

	protected AVolume(double value, Unit<Volume> unit, MathContext mc)
			throws OutOfRange {
		super(value, mc);
		this.currentUnit = unit;
	}
	public MDecimal getLitres() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(LITRE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Litres : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getUSGallonsDry() {
		MDecimal result = new MDecimal(currentUnit
				.getConverterTo(GALLON_DRY_US).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to US Gallons (dry) : {}", currentUnit,
				result);
		return result;
	}

	public MDecimal getUSGallonsLiquid() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(
				GALLON_LIQUID_US).convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to US Gallons (liquid) : {}", currentUnit,
				result);
		return result;
	}

	/**
	 * Imperial Gallons
	 * 
	 * @return
	 */
	public MDecimal getImpGallon() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(GALLON_UK)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER,
				"Converting from {} to Imperial Gallons : {}", currentUnit,
				result);
		return result;
	}

	
}
