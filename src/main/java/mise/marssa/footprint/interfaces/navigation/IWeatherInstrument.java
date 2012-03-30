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
package mise.marssa.footprint.interfaces.navigation;

import mise.marssa.footprint.datatypes.decimal.PercentageFloat;
import mise.marssa.footprint.datatypes.decimal.speed.Knots;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;

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

}
