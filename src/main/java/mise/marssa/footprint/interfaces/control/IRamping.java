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
package mise.marssa.footprint.interfaces.control;

import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.exceptions.ConfigurationError;
import mise.marssa.footprint.exceptions.NoConnection;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * interface for ramping module
 * 
 * @author Alan
 * @version 1.0
 * @updated 08-Jul-2011 15:00:19
 */
public interface IRamping {

	/**
	 * Ramps the output value from the current value to the desired value
	 * 
	 * @param desiredValue
	 *            the value which is desired on the output
	 * @throws InterruptedException
	 * @throws ConfigurationError
	 * @throws OutOfRange
	 * @throws NoConnection
	 */
	public void rampTo(MDecimal desiredValue) throws InterruptedException,
			ConfigurationError, OutOfRange, NoConnection;

	/**
	 * Get current value of the Ramping instance<br />
	 * This is the same as the last value which was sent on the outputValue
	 * method of the IController Interface Note: The Ramping instance might not
	 * necessarily be in the idle state. If it is in the process of executing
	 * the rampTo method, the current value will be returned
	 * 
	 * @return the current value of the Ramping instance
	 * @see mise.marssa.footprint.interfaces.control.IController
	 */
	public MDecimal getCurrentValue();

	void increase(MDecimal incrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange, NoConnection;

	void decrease(MDecimal decrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange, NoConnection;
}
