package mise.marssa.interfaces.control;

import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.exceptions.ConfigurationError;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 02-Aug-2011 10:43:24
 */
public interface IController {
	/**
	 * Sends the value to the output port
	 * @param value the value which will be sent to the output port
	 * @throws OutOfRange 
	 * @throws ConfigurationError 
	 */
	public void outputValue(MFloat value) throws ConfigurationError, OutOfRange;
	
	/**
	 * Get the last value which was sent to the output port
	 * @return last value which was sent to the output port
	 */
	public MFloat getValue();
}
