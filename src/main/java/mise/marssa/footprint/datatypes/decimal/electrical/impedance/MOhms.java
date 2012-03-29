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
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

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
@XmlType(name = "MOhms", factoryClass = TypeFactory.class, factoryMethod = "getMOhmsInstance")
@Entity
public class MOhms extends AImpedance{

	private static Logger MOhms = (Logger) LoggerFactory.getLogger("MOhms");

	public MOhms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		MOhms.trace(MMarker.GETTER,"Converting from MOhms to Ohms : {}",value*1000000);
		return value*1000000;
	}

	@Override
	public float getKOhms() {
		MOhms.trace(MMarker.GETTER,"Converting from MOhms to KOhms : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMOhms() {
		MOhms.trace(MMarker.GETTER,"Getting MOhms: {}",value);
		return value;
	}

}
