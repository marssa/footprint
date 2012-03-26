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
/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "MilliAmps", factoryClass = TypeFactory.class, factoryMethod = "getMilliAmpsInstance")
@Entity
public class MilliAmps extends ACurrent {
	private static Logger MilliAmps = (Logger) LoggerFactory.getLogger("MilliAmps");

	public MilliAmps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		MilliAmps.trace(MMarker.GETTER,"Converting from MilliAmps to Amps : {}",value / 1000);
		return value / 1000;
	}

	@Override
	public float getMilliAmps() {
		MilliAmps.trace(MMarker.GETTER,"Getting MilliAmps: {}",value);
		return value;
	}
}
