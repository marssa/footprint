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

import mise.marssa.footprint.datatypes.composite.Attitude;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MDecimal;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ICompass {

	/**
	 * Compass returns Roll & Pitch
	 */
	public Attitude getAttitude();

	public DegreesFloat getDeviation();

	public DegreesFloat getHeading();

	public DegreesFloat getMagneticHeading();

	public MDecimal getRateOfTurn();

	public DegreesFloat getTrueHeading();

	/**
	 * Difference between True North & Magnetic North
	 */
	public DegreesFloat getVariation();

}
