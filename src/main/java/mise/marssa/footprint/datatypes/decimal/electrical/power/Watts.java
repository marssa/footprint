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

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;


/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "Watts", factoryClass = TypeFactory.class, factoryMethod = "getWattsInstance")
@Entity
public class Watts extends APower {

	private static Logger Watts = (Logger) LoggerFactory.getLogger("Watts");

	public Watts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		Watts.trace(MMarker.GETTER,"Getting Watts: {}",value);
		return value;
	}

	@Override
	public float getKWatts() {
		Watts.trace(MMarker.GETTER,"Converting from Watts to KWatts : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMWatts() {
		Watts.trace(MMarker.GETTER,"Converting from Watts to MWatts : {}",value / 1000000);
		return (value/1000000);
	}

}
