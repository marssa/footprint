/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.voltage;

import mise.marssa.data_types.conversion_interfaces.IVoltage;
import mise.marssa.data_types.float_datatypes.MFloat;

/**
 * @author Lifebook
 *
 */
public abstract class AVoltage extends MFloat implements IVoltage{
	public AVoltage (float value) {
		super(value);
	}
	
}

