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
/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "AVolumeFlow", factoryClass = TypeFactory.class, factoryMethod = "getAVolumeFlowInstance")
public abstract class AVolumeFlow extends UnsignedFloat {

	/**
	 * 
	 */
	public AVolumeFlow(float value) throws OutOfRange{
		super(value);
	}
	
	/**
	 * Litres per hour
	 * @return
	 */
	abstract public float getLPH(); 
	
	/**
	 * Litres per minute
	 * @return
	 */
	abstract public float getLPM();
	
	/**
	 * Litres per second
	 * @return
	 */
	abstract public float getLPS();
	
	/**
	 * Meters cubed per second (m^3/s)
	 * @return
	 */
	abstract public float getMCPS();
	
	/**
	 * Meters cubed per minute
	 * @return
	 */
	abstract public float getMCPM();
	
	/**
	 * Meters cuber per hour
	 * @return
	 */
	abstract public float getMCPH();
	
	/**
	 * Cubic foot per second
	 * @return
	 */
	abstract public float getCFPS();
	
	/**
	 * Cubic foot per minute
	 * @return
	 */
	abstract public float getCFPM();
	
	/**
	 * Cubic foot per hour
	 * @return
	 */
	abstract public float getCFPH();
	
	//TODO US & UK gallons
	
	@Override
	public String toString() {
		return "Volume Flow in " + this.getClass().getSimpleName() + " = " + value;
	}
}
