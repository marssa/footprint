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
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

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
@XmlType(name = "mAh", factoryClass = TypeFactory.class, factoryMethod = "getmAhInstance")
@Entity
public class mAh extends ACharge {
	private static Logger mAh = (Logger) LoggerFactory.getLogger("mAh");

	public mAh(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		mAh.trace(MMarker.GETTER,"Converting from mAh to Ah : {}",value / 1000);
		return value / 1000;
	}

	@Override
	public float getmAh() {
		mAh.trace(MMarker.GETTER,"Getting mAh: {}",value);
		return value;
	}

	@Override
	public float getColoumbs() {
		mAh.trace(MMarker.GETTER,"Converting from mAh to Coulombs : {}",value * (float) 3.6);
		return value * (float) 3.6;
	}
}
