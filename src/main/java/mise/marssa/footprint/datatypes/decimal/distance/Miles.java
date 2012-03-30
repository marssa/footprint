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
package mise.marssa.footprint.datatypes.decimal.distance;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

/**
 * @author Alan Grech.grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Miles", factoryClass = TypeFactory.class, factoryMethod = "getMilesInstance")
@Entity

public class Miles extends ADistance {

	private static Logger Miles = (Logger) LoggerFactory.getLogger("Miles");
	public Miles(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		Miles.trace(MMarker.GETTER,"Converting from Miles to Km : {}",value * (float) 1.609344);
		return value * (float) 1.609344;
	}

	@Override
	public float getMetres() {
		Miles.trace(MMarker.GETTER,"Converting from Miles to Metres : {}",value * (float) 1609.344);
		return value * (float) 1609.344;
	}

	@Override
	public float getMiles() {
		Miles.trace(MMarker.GETTER,"Getting Miles: {}",value);
		return value;
	}

	@Override
	public float getNM() {
		Miles.trace(MMarker.GETTER,"Converting from Miles to NMiles : {}",value * (float) 0.868976242);
		return value * (float) 0.868976242;
	}

	@Override
	public float getFathoms() {
		Miles.trace(MMarker.GETTER,"Converting from Miles to Fathoms : {}",value *  880);
		return value *  880;
	}
}
