/*******************************************************************************
 * Copyright 2012 Marsec-XL Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Bar", factoryClass = TypeFactory.class, factoryMethod = "getBarInstance")
@Entity
public class Bar extends APressure {

	private static Logger Bar = (Logger) LoggerFactory.getLogger("Bar");
	public Bar(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		Bar.trace(MMarker.GETTER,"Getting Bar: {}",value);
		return value;
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MBars : {}",value / 1000);
		return value / 1000;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MBars : {}",value * (10 ^ -5));
		return value * (10 ^ -5);
	}

	@Override
	public float getMMHg() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MMHg : {}",value * (float) 750.061683);
		return value * (float) 750.061683;
	}

	@Override
	public float getPSI() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to PSI : {}",value * (float) 14.5037738);
		return value * (float) 14.5037738;
	}

	@Override
	public float getKPa() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to KPa : {}",value * (10 ^ 2));
		return value * (10 ^ 2);
	}
}
