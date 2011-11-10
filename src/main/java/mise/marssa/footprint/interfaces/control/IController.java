package mise.marssa.footprint.interfaces.control;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;
import mise.marssa.footprint.exceptions.ConfigurationError;
import mise.marssa.footprint.exceptions.NoConnection;
import mise.marssa.footprint.exceptions.OutOfRange;

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
		OFF(0),
		POSITIVE(1),
		NEGATIVE(2);
		
		private Polarity(int polarity) { }
	};
	
	/**
	 * Sends the value to the output port
	 * @param value the value which will be sent to the output port
	 * @throws OutOfRange 
	 * @throws ConfigurationError 
	 * @throws NoConnection 
	 */
	public void outputValue(MFloat value) throws ConfigurationError, OutOfRange, NoConnection;
	
	/**
	 * Sets the polarity signal for Controllers which use it
	 * @param polarity the polarity state. 
	 * @throws NoConnection 
	 */
	void setPolaritySignal(Polarity polarity) throws NoConnection;
	
	/**
	 * Get the last value which was sent to the output port
	 * @return last value which was sent to the output port
	 */
	public MFloat getValue();
}
