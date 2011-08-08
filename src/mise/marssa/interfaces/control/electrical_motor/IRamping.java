package mise.marssa.interfaces.control.electrical_motor;

import mise.marssa.data_types.float_datatypes.MFloat;

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
	 */
	public void rampTo(MFloat desiredValue) throws InterruptedException;

}