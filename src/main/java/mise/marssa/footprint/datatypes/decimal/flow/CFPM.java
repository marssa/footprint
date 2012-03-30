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
 * conversions for: cubic foot per minute
 */
@XmlType(name = "CFPM", factoryClass = TypeFactory.class, factoryMethod = "getCFPMInstance")
@Entity
public class CFPM extends AVolumeFlow {

	private static Logger CFPM = (Logger) LoggerFactory.getLogger("CFPM");
	public CFPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to LPH : {}",value * 1699.01082f);
		return value * 1699.01082f;
	}

	@Override
	public float getLPM() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to LPM : {}",value * 28.316846999f);
		return value * 28.316846999f;
	}

	@Override
	public float getLPS() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to LPS : {}",value * 0.47194745f);
		return value * 0.47194745f;
	}

	@Override
	public float getMCPS() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to MCPS : {}",value * 0.00047194745f);
		return value * 0.00047194745f;
	}

	@Override
	public float getMCPM() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to MCPM : {}",value * 0.02831684699f);
		return value * 0.02831684699f;
	}

	@Override
	public float getMCPH() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to MCPH : {}",value * 1.69901082f);
		return value * 1.69901082f;
	}

	@Override
	public float getCFPS() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to CFPS : {}",value * 0.016666666667f);
		return value * 0.016666666667f;
	}

	@Override
	public float getCFPM() {
		CFPM.trace(MMarker.GETTER,"Getting CFPM: {}",value);
		return value;
	}

	@Override
	public float getCFPH() {
		CFPM.trace(MMarker.GETTER,"Converting from CFPM to CFPH : {}",value * 60f);
		return value * 60f;
	}
}
