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
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.footprint.datatypes.decimal.volume;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

@XmlType(name = "AVolume", factoryClass = TypeFactory.class, factoryMethod = "getAVolumeInstance")
public abstract class AVolume extends UnsignedFloat {

	public AVolume(float value) throws OutOfRange {
		super(value);
	}

	abstract public float getLiters();

	abstract public float getGallon();

	/**
	 * Imperial Gallons
	 * 
	 * @return
	 */
	abstract public float getImpGallon();

	@Override
	public String toString() {
		return "Volume in " + this.getClass().getSimpleName() + " = " + value;
	}
}
