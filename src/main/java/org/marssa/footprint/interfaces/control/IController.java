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
package org.marssa.footprint.interfaces.control;

import org.marssa.footprint.datatypes.decimal.MDecimal;
import org.marssa.footprint.exceptions.ConfigurationError;
import org.marssa.footprint.exceptions.NoConnection;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 02-Aug-2011 10:43:24
 */
public interface IController {
	/**
	 * The Polarity of the Controller
	 */
	public enum Polarity {
		OFF(0), POSITIVE(1), NEGATIVE(2);

		private Polarity(int polarity) {
		}
	};

	/**
	 * Sends the value to the output port
	 * 
	 * @param value
	 *            the value which will be sent to the output port
	 * @throws OutOfRange
	 * @throws ConfigurationError
	 * @throws NoConnection
	 */
	public void outputValue(MDecimal value) throws ConfigurationError,
			OutOfRange, NoConnection;

	/**
	 * Sets the polarity signal for Controllers which use it
	 * 
	 * @param polarity
	 *            the polarity state.
	 * @throws NoConnection
	 */
	void setPolaritySignal(Polarity polarity) throws NoConnection;

	/**
	 * Get the last value which was sent to the output port
	 * 
	 * @return last value which was sent to the output port
	 */
	public MDecimal getValue();
}
