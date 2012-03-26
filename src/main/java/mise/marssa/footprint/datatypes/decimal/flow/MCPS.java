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
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * conversion for: mcubic meters per second
 */
@XmlType(name = "MCPS", factoryClass = TypeFactory.class, factoryMethod = "getMCPSInstance")
@Entity
public class MCPS extends AVolumeFlow {

	private static Logger MCPS = (Logger) LoggerFactory.getLogger("MCPS");
	public MCPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to LPH : {}",value * 1000f * 3600f);
		return value * 1000f * 3600f;
	}

	@Override
	public float getLPM() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to LPM : {}",value * 1000f * 60f);
		return value * 1000f * 60f;
	}

	@Override
	public float getLPS() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to LPS : {}",value * 1000f);
		return value * 1000f;
	}

	@Override
	public float getMCPS() {
		MCPS.trace(MMarker.GETTER,"Getting MCPS: {}",value);
		return value;
	}

	@Override
	public float getMCPM() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to MCPM : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getMCPH() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to MCPH : {}",value * 3600f);
		return value * 3600f;
	}

	@Override
	public float getCFPS(){ 
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to CFPS : {}",value * 35.314666213f);
		return value *  35.314666213f;
	}

	@Override
	public float getCFPM() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to CFPM : {}",value * 2118.8799728f);
		return value * 2118.8799728f;
	}

	@Override
	public float getCFPH() {
		MCPS.trace(MMarker.GETTER,"Converting from MCPS to CFPH : {}",value * 127132.79837f);
		return value * 127132.79837f;
	}

}
