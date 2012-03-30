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
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 10:52:23
 */

@XmlType(name = "MPH", factoryClass = TypeFactory.class, factoryMethod = "getMPHInstance")
@Entity
public class MPH extends ASpeed{
	
	private static Logger MPH = (Logger) LoggerFactory.getLogger("MPH");

	public MPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKPH() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to KPH : {}",value *(float) 1.609);
		return value *(float) 1.609;
	}

	@Override
	public float getMPH() {
		MPH.trace(MMarker.GETTER,"Getting MPH: {}",value);
		return value;
	}

	@Override
	public float getKnots() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to Knots : {}",(value * (float)1.609) / ((float) 1.852));
		return (value * (float)1.609) / ((float) 1.852);
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to MPS : {}",value * ((float) 1.609)*1000 / 3600);
		return value * ((float) 1.609)*1000 / 3600;
	}
}
