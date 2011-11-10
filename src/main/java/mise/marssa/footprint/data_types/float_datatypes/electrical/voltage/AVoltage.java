/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Lifebook
 *
 */
public abstract class AVoltage extends MFloat {
	public AVoltage (float value) {
		super(value);
	}
	
	abstract public float getVolts();
	abstract public float getMilliVolts();
}

