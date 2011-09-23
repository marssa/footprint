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
	 * 
	 * @param newValue
	 * @throws InterruptedException 
	 * @throws OutOfRange 
	 * @throws ConfigurationError 
	 */
	public void rampTo(MFloat desiredValue) throws InterruptedException, ConfigurationError, OutOfRange;

}