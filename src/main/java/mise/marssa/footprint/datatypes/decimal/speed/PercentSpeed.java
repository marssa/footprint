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
package mise.marssa.footprint.datatypes.decimal.speed;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentSpeed", factoryClass = TypeFactory.class, factoryMethod = "getPercentSpeedInstance")
@Entity
public class PercentSpeed extends ASpeed {
//TODO whole class
	private static Logger PercentSpeed = (Logger) LoggerFactory.getLogger("PercentSpeed");

	public PercentSpeed(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		return 0;
	}

	@Override
	public float getKPH() {
		return 0;
	}
	
	@Override
	public float getMPH(){
		return 0;
	}

	/**
	 * get metres per second
	 */
	@Override
	public float getMPS() {
		return 0;
	}
}
