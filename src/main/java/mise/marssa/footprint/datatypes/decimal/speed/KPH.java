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
 * Kilometres per hour
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */

@XmlType(name = "KPH", factoryClass = TypeFactory.class, factoryMethod = "getKPHInstance")
@Entity
public class KPH extends ASpeed {

	private static Logger KPH = (Logger) LoggerFactory.getLogger("KPH");

	public KPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getMPH(){
		KPH.trace(MMarker.GETTER,"Converting from KPH to MPH : {}",value * (50f / 80f));
		return value * (50f / 80f);
	}

	@Override
	public float getKnots() {
		KPH.trace(MMarker.GETTER,"Converting from KPH to Knots : {}",value / 1.852f);
		return value / 1.852f;
	}

	@Override
	public float getKPH() {
		KPH.trace(MMarker.GETTER,"Getting KPH: {}",value);
		return value;
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		KPH.trace(MMarker.GETTER,"Converting from KPH to MPS : {}",value * 1000f / 3600f);
		return value * 1000f / 3600f;
	}
}
