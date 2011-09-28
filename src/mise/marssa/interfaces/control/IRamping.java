package mise.marssa.interfaces.control;

import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.exceptions.ConfigurationError;
import mise.marssa.exceptions.OutOfRange;

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
	 * @param desiredValue the value which is desired on the output
	 * @throws InterruptedException
	 * @throws ConfigurationError
	 * @throws OutOfRange
	 */
	public void rampTo(MFloat desiredValue) throws InterruptedException, ConfigurationError, OutOfRange;
	
	/**
	 * Get current value of the Ramping instance<br />
	 * This is the same as the last value which was sent on the outputValue method of the IController Interface 
	 * Note: The Ramping instance might not necessarily be in the idle state. If it is in the process of executing the rampTo method, the current value will be returned
	 * @return the current value of the Ramping instance
	 * @see mise.marssa.interfaces.control.IController
	 */
	public MFloat getCurrentValue();

	void increase(MFloat incrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange;

	void decrease(MFloat decrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange;
}