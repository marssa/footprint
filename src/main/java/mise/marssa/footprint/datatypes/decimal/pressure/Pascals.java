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
package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Pascals", factoryClass = TypeFactory.class, factoryMethod = "getPascalsInstance")
@Entity
public class Pascals extends APressure {

	private static Logger Pascals = (Logger) LoggerFactory.getLogger("Pascals");

	public Pascals(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to Bars : {}",(float) (value * Math.pow(10, -5)));
		return (float) (value * Math.pow(10, -5));
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to MBars : {}",value * 1000f);
		return value * 1000f;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		Pascals.trace(MMarker.GETTER,"Getting Pascals: {}",value);
		return value;
	}

	@Override
	public float getMMHg() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to MMHg : {}",value * 0.00750061683f);
		return value * 0.00750061683f;
	}

	@Override
	public float getKPa() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to KPa : {}",value / 1000f);
		return value / 1000f;
	}

	@Override
	public float getPSI() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to PSI : {}",value * 0.000145037738f);
		return value * 0.000145037738f;
	}
}
