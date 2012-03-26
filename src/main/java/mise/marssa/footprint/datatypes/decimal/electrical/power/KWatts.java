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
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "KWatts", factoryClass = TypeFactory.class, factoryMethod = "getKWattsInstance")
@Entity
public class KWatts extends APower{

	private static Logger KWatts = (Logger) LoggerFactory.getLogger("KWatts");

	public KWatts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		KWatts.trace(MMarker.GETTER,"Converting from KWatts to Watts : {}",value * 1000);
		return value*1000;
	}

	@Override
	public float getKWatts() {
		KWatts.trace(MMarker.GETTER,"Getting KWatts: {}",value);
		return value;
	}

	@Override
	public float getMWatts() {
		KWatts.trace(MMarker.GETTER,"Converting from KWatts to MWatts : {}",value / 1000);
		return (value/1000);
	}

	

}
