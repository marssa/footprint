package mise.marssa.interfaces.control;

import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.exceptions.ConfigurationError;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Clayton
 * @version 1.0
 * @created 02-Aug-2011 10:43:24
 */
public interface IController {
	/**
	 * 
	 * @param value
	 * @throws OutOfRange 
	 * @throws ConfigurationError 
	 */
	public void outputValue(MFloat value) throws ConfigurationError, OutOfRange;
}
