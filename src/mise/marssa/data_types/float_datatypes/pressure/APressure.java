package mise.marssa.data_types.float_datatypes.pressure;

import mise.marssa.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.data_types.conversion_interfaces.IPressure;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class APressure extends UnsignedFloat implements IPressure {

	public APressure(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}