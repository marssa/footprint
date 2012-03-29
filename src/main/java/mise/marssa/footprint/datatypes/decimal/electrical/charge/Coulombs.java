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
@XmlType(name = "Coulombs", factoryClass = TypeFactory.class, factoryMethod = "getCoulombsInstance")
@Entity
public class Coulombs extends ACharge {

	private static Logger Coulombs = (Logger) LoggerFactory.getLogger("Coulombs");
	public Coulombs(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		Coulombs.trace(MMarker.GETTER,"Converting from Coulombs to Ah : {}",value / (float) 3.6);
		return value / 3600;
	}

	@Override
	public float getmAh() {
		Coulombs.trace(MMarker.GETTER,"Converting from Coulombs to mAh : {}",value / (float) 3.6);
		return value / (float) 3.6;
	}

	@Override
	public float getColoumbs() {
		Coulombs.trace(MMarker.GETTER,"Getting Coulombs: {}",value);
		return value;
	}
}
