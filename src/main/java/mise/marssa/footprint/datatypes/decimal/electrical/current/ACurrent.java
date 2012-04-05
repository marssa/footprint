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
/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import static javax.measure.unit.SI.MILLI;
import static javax.measure.unit.SI.AMPERE;

import javax.measure.quantity.ElectricCurrent;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "ACurrent", factoryClass = TypeFactory.class, factoryMethod = "getACurrentInstance")
public abstract class ACurrent extends MDecimal {
	/**
	 * 
	 */
	private static final long serialVersionUID = -8993349717007960067L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(ACurrent.class.getName());

	private Unit<ElectricCurrent> currentUnit;

	public ACurrent(double value, Unit<ElectricCurrent> unit) {
		super(value);
		this.currentUnit = unit;
	}

	public MDecimal getAmps() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(AMPERE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Amps : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMilliAmps() {
		MDecimal result = new MDecimal(currentUnit
				.getConverterTo(MILLI(AMPERE)).convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				currentUnit, result);
		return result;
	}

	@Override
	public String toString() {
		return "Current in " + this.getClass().getSimpleName() + " = "
				+ super.toString();
	}
}
