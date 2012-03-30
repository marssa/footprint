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
package mise.marssa.footprint.datatypes.decimal.speed;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * Meters per Second
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 * 
 * 
 */

@XmlType(name = "MPS", factoryClass = TypeFactory.class, factoryMethod = "getMPSInstance")
@Entity
public class MPS extends ASpeed {

	private static Logger MPS = (Logger) LoggerFactory.getLogger("MPS");

	public MPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		MPS.trace(MMarker.GETTER,"Converting from MPS to Knots : {}",value * (float) 1.9438444924406);
		return value * (float) 1.9438444924406;
	}

	@Override
	public float getKPH() {
		MPS.trace(MMarker.GETTER,"Converting from MPS to KPH : {}",value * 3600 / 1000);
		return value * 3600 / 1000;
	}

	@Override
	public float getMPH(){
		MPS.trace(MMarker.GETTER,"Converting from MPS to MPH : {}",value * (float) ((3600.0/1000.0) * (50.0/80.0)));
		return value * (float) ((3600.0/1000.0) * (50.0/80.0));
	}
	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		MPS.trace(MMarker.GETTER,"Getting MPS: {}",value);
		return value;
	}
}
