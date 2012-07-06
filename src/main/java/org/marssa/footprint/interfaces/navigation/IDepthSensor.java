/**
 * Copyright 2012 MARSEC-XL International Limited
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
package org.marssa.footprint.interfaces.navigation;

import javax.xml.bind.annotation.XmlType;

import org.marssa.footprint.datatypes.decimal.distance.ADistance;
import org.marssa.footprint.datatypes.decimal.temperature.ATemperature;
import org.marssa.footprint.exceptions.OutOfRange;
import org.marssa.footprint.interfaces.IQuantity;

/**
 * @author Warren Zahra
 * 
 */
public interface IDepthSensor {

	public ADistance getDepthMeters() throws OutOfRange;

	public ATemperature getTemperatureDegrees() throws OutOfRange;

	@XmlType(name = "DepthSensorQuantities")
	public enum CompassQuantity implements IQuantity {
		DEPTH_METERS, TEMPERATURE;
	}

}
