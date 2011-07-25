package mise.marssa.data_types.float_datatypes.temperature;

import mise.marssa.data_types.float_datatypes.Float;
import mise.marssa.data_types.conversion_interfaces.ITemperature;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class ATemperature extends Float implements ITemperature {

	public ATemperature(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}