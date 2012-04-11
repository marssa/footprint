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
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.MEGA;
import static javax.measure.unit.SI.WATT;

import javax.measure.quantity.Power;
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
@XmlType(name = "APower", factoryClass = TypeFactory.class, factoryMethod = "getAPowerInstance")
public abstract class APower extends MDecimal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4249306033520691147L;

	private static Logger logger = (Logger) LoggerFactory
			.getLogger(APower.class.getName());

	private Unit<Power> currentUnit;

	protected APower(double value, Unit<Power> unit) {
		super(value);
	}

	public MDecimal getWatts() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(WATT)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Watts : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getKWatts() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(KILO(WATT))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Kilo Watts : {}",
				currentUnit, result);
		return result;
	}

	public MDecimal getMWatts() {
		MDecimal result = new MDecimal(currentUnit.getConverterTo(MEGA(WATT))
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Mega Watts : {}",
				currentUnit, result);
		return result;
	}

	
}
