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
package mise.marssa.footprint.datatypes.decimal.frequency;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "KHz", factoryClass = TypeFactory.class, factoryMethod = "getKHzInstance")
@Entity
public class KHz extends AFrequency {

	static Logger KHz = (Logger) LoggerFactory.getLogger("KHz");
	public KHz(float value) throws OutOfRange {
		super(value);
	}

	/**
	 * Hz is the SI unit
	 */
	@Override
	public float getHz() {
		KHz.trace(MMarker.GETTER,"Converting from KHz to Hz : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getKHz() {
		KHz.trace(MMarker.GETTER,"Getting KHz: {}",value);
		return value;
	}
}
