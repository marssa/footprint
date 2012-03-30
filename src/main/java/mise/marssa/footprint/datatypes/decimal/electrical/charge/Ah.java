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
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

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
@XmlType(name = "Ah", factoryClass = TypeFactory.class, factoryMethod = "getAhInstance")
@Entity
public class Ah extends ACharge{

	private static Logger Ah = (Logger) LoggerFactory.getLogger("Ah");
	
	public Ah(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		Ah.trace(MMarker.GETTER,"Getting Ah: {}",value);
		return value;
	}

	@Override
	public float getmAh() {
		Ah.trace(MMarker.GETTER,"Converting from Ah to mAh : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getColoumbs() {
		Ah.trace(MMarker.GETTER,"Converting from Ah to Coulombs : {}",value * 3600);
		return value * 3600;
	}
}
