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
package mise.marssa.footprint.datatypes.decimal.volume;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

@XmlType(name = "ImpGallons", factoryClass = TypeFactory.class, factoryMethod = "getImpGallonsInstance")
@Entity
public class ImpGallons extends AVolume {
	private static Logger ImpGallons = (Logger) LoggerFactory.getLogger("ImpGallons");

	public ImpGallons(float value) throws OutOfRange {
		super(value);
	}
	
	@Override
	public float getLiters() {
		ImpGallons.trace(MMarker.GETTER,"Converting from ImpGallons to Litres : {}",value *(float)4.54609188);
		return value *(float)4.54609188;
	}

	@Override
	public float getGallon() {
		ImpGallons.trace(MMarker.GETTER,"Converting from ImpGallons to Gallons : {}",value *(float)1.20095042);
		return value *(float)1.20095042;
	}

	@Override
	public float getImpGallon() {
		ImpGallons.trace(MMarker.GETTER,"Getting ImpGallons: {}",value);
		return value;
	}
}
