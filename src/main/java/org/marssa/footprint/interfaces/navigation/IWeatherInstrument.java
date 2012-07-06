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
package org.marssa.footprint.interfaces.navigation;

import javax.xml.bind.annotation.XmlType;

import org.marssa.footprint.datatypes.decimal.PercentageFloat;
import org.marssa.footprint.datatypes.decimal.speed.Knots;
import org.marssa.footprint.datatypes.integer.DegreesInteger;
import org.marssa.footprint.interfaces.IQuantity;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public interface IWeatherInstrument {

	public Float getAirTemperature();

	public Float getDewpoint();

	public Knots getGustSpeed();

	public PercentageFloat getHumidity();

	public Float getPressure();

	public Float getSolarRadiation();

	public DegreesInteger getWindDirection();

	public Knots getWindSpeed();

	@XmlType(name = "WeatherInstrumentQuantities")
	public enum CompassQuantity implements IQuantity {
		AIR_TEMPERATURE, DEW_POINT, GUST_SPEED, HUMIDITY, AIR_PRESSURE, SOLAR_RADIATION, WIND_DIRECTION, WIND_SPEED;
	}

}
