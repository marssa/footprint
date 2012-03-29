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
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech
 * cubic meters per minute
 */
@XmlType(name = "MCPM", factoryClass = TypeFactory.class, factoryMethod = "getMCPMInstance")
@Entity
public class MCPM extends AVolumeFlow {

	private static Logger MCPM = (Logger) LoggerFactory.getLogger("MCPM");
	public MCPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f* 60f);
		return value * 1000f * 60f;
	}

	@Override
	public float getLPM() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f);
		return value * 1000f;
	}

	@Override
	public float getLPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f/ 60f);
		return value * 1000f / 60f;
	}

	@Override
	public float getMCPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value / 60f);
		return value / 60f;
	}

	@Override
	public float getMCPM() {
		MCPM.trace(MMarker.GETTER,"Getting MCPM: {}",value);
		return value;
	}

	@Override
	public float getMCPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getCFPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 0.58857777022f);
		return value * 0.58857777022f;
	}

	@Override
	public float getCFPM() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 35.314666213f);
		return value * 35.314666213f;
	}

	@Override
	public float getCFPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 2118.8799728f);
		return value * 2118.8799728f;
	}
}
