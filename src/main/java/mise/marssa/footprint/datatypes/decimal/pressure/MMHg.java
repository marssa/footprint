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

@XmlType(name = "MMHg", factoryClass = TypeFactory.class, factoryMethod = "getMMHgInstance")
@Entity
public class MMHg extends APressure {

	private static Logger MMHg = (Logger) LoggerFactory.getLogger("MMPg");

	public MMHg(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to Bars : {}",value * 0.001333223684211f);
		return value * 0.001333223684211f;
	}

	@Override
	public float getMBars() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to MBars : {}",value * 1.333223684211f);
		return value * 1.333223684211f;
	}

	@Override
	public float getPa() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to Pascals : {}",value * 133.3223684211f);
		return value * 133.3223684211f;
	}

	@Override
	public float getKPa() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to KPa : {}",value * 0.1333223684211f);
		return value * 0.1333223684211f;
	}

	@Override
	public float getMMHg() {
		MMHg.trace(MMarker.GETTER,"Getting MMHg: {}",value);
		return value;
	}

	@Override
	public float getPSI() {
		MMHg.trace(MMarker.GETTER,"Converting from MMHg to PSI : {}",value * 0.01933679515879f);
		return value * 0.01933679515879f;
	}
}
