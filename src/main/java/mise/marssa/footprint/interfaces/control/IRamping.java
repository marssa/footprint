package mise.marssa.footprint.interfaces.control;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;
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
	 * @param desiredValue the value which is desired on the output
	 * @throws InterruptedException
	 * @throws ConfigurationError
	 * @throws OutOfRange
	 * @throws NoConnection 
	 */
	public void rampTo(MFloat desiredValue) throws InterruptedException, ConfigurationError, OutOfRange, NoConnection;
	
	/**
	 * Get current value of the Ramping instance<br />
	 * This is the same as the last value which was sent on the outputValue method of the IController Interface 
	 * Note: The Ramping instance might not necessarily be in the idle state. If it is in the process of executing the rampTo method, the current value will be returned
	 * @return the current value of the Ramping instance
	 * @see mise.marssa.footprint.interfaces.control.IController
	 */
	public MFloat getCurrentValue();

	void increase(MFloat incrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange, NoConnection;

	void decrease(MFloat decrementValue) throws InterruptedException,
			ConfigurationError, OutOfRange, NoConnection;
}