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
package mise.marssa.footprint.datatypes.decimal.electrical.voltage;

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
@XmlType(name = "MilliVolts", factoryClass = TypeFactory.class, factoryMethod = "getMilliVoltsInstance")
@Entity
public class MilliVolts extends AVoltage {

	private static Logger MilliVolts = (Logger) LoggerFactory.getLogger("MilliVolts");

	public MilliVolts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		MilliVolts.trace(MMarker.GETTER,"Converting from MilliVolts to Volts : {}",value / 1000f);
		return value / 1000f;
	}

	@Override
	public float getMilliVolts() {
		MilliVolts.trace(MMarker.GETTER,"Getting MilliVolts: {}",value);
		return value;
	}
}
