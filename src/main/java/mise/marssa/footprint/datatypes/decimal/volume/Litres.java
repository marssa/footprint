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

@XmlType(name = "Litres", factoryClass = TypeFactory.class, factoryMethod = "getLitresInstance")
@Entity
public class Litres extends AVolume {

	private static Logger Litres = (Logger) LoggerFactory.getLogger("Litres");

	public Litres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLiters() {
		Litres.trace(MMarker.GETTER,"Getting Litres: {}",value);
		return value;
	}

	@Override
	public float getGallon() {
		Litres.trace(MMarker.GETTER,"Converting from Litres to Gallon : {}",value * 0.264172052f );
		return value * 0.264172052f;
	}

	@Override
	public float getImpGallon() {
		Litres.trace(MMarker.GETTER,"Converting from Litres to ImpGallon : {}",value * 0.219969157f);
		return value * 0.219969157f;
	}
}
