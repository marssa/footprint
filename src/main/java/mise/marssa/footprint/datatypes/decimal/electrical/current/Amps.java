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

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Amps", factoryClass = TypeFactory.class, factoryMethod = "getAmpsInstance")
@Entity
public class Amps extends ACurrent {
	private static Logger Amps = (Logger) LoggerFactory.getLogger("Amps");

	public Amps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		Amps.trace(MMarker.GETTER,"Getting Amps: {}",value);
		return value;
	}

	@Override
	public float getMilliAmps() {
		Amps.trace(MMarker.GETTER,"Converting from Amps to MilliAmps : {}",value * 1000);
		return value * 1000;
	}
}
