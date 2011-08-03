package mise.marssa.data_types.float_datatypes.frequency;

import mise.marssa.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.data_types.conversion_interfaces.IFrequency;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class AFrequency extends UnsignedFloat implements IFrequency {

	public AFrequency(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}