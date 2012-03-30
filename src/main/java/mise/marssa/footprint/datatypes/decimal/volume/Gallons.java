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
package mise.marssa.footprint.datatypes.decimal.volume;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

@XmlType(name = "Gallons", factoryClass = TypeFactory.class, factoryMethod = "getGallonsInstance")
@Entity
public class Gallons extends AVolume {
	private static Logger Gallons = (Logger) LoggerFactory.getLogger("Gallons");

	public Gallons(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		Gallons.trace(MMarker.GETTER,"Converting from Gallons to Litres : {}",value * (float) 3.78541178 );
		return value * (float) 3.78541178 ;
	}

	@Override
	public float getGallon() {
		Gallons.trace(MMarker.GETTER,"Getting Gallons: {}",value);
		return value;
	}

	@Override
	public float getImpGallon() {
		Gallons.trace(MMarker.GETTER,"Converting from Gallons to ImpGallon : {}",value * (float) 0.83267384);
		return value * (float) 0.83267384 ;
	}
}
