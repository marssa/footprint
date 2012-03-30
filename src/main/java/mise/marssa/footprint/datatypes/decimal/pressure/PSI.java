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


@XmlType(name = "PSI", factoryClass = TypeFactory.class, factoryMethod = "getPSIInstance")
@Entity
public class PSI extends APressure {

	private static Logger PSI = (Logger) LoggerFactory.getLogger("PSI");

	public PSI(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to Bars : {}",value * 0.0689475f);
		return value * 0.0689475f;
	}

	@Override
	public float getMBars() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to MBars : {}",value *68.9475f);
		return value * 68.9475f;
	}

	@Override
	public float getPa() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to Pascals : {}",value * 6894.75f);
		return value * 6894.75f;
	}

	@Override
	public float getKPa() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to KPa : {}",value * 6.89475f);
		return value * 6.89475f;
	}

	@Override
	public float getMMHg() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to MMHg : {}",value * 51.71487786825f);
		return value * 51.71487786825f;
	}

	@Override
	public float getPSI() {
		PSI.trace(MMarker.GETTER,"Getting PSI: {}",value);
		return value;
	}
}
