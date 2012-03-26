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
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */

@XmlType(name = "Knots", factoryClass = TypeFactory.class, factoryMethod = "getKnotsInstance")
@Entity
public class Knots extends ASpeed {

	private static Logger Knots = (Logger) LoggerFactory.getLogger("Knots");

	public Knots(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		Knots.trace(MMarker.GETTER,"Getting Knots: {}",value);
		return value;
	}

	@Override
	public float getKPH() {
		Knots.trace(MMarker.GETTER,"Converting from Knots to KPH : {}",value * (float) 1.852);
		return value * (float) 1.852;
	}

	@Override
	public float getMPH(){
		Knots.trace(MMarker.GETTER,"Converting from Knots to MPH : {}",value * (float) (1.852 * (50.0 / 80.0)));
		return value * (float) (1.852 * (50.0 / 80.0));
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		Knots.trace(MMarker.GETTER,"Converting from Knots to MPS : {}",value * (float) 1.852 * 1000 / 3600);
		return value * (float) 1.852 * 1000 / 3600;
	}
}
