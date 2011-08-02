package mise.marssa.interfaces.electrical_motor_control;

import mise.marssa.data_types.float_datatypes.Percentage;

/**
 * interface for ramping module
 * 
 * @author Alan Grech
 * @version 1.0
 * @updated 08-Jul-2011 15:00:19
 */
public interface IRamping {

	/**
	 * 
	 * @param newValue
	 */
	public void rampTo(Percentage newValue);

}