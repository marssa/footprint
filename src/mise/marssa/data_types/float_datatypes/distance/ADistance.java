package mise.marssa.data_types.float_datatypes.distance;

import mise.marssa.data_types.conversion_interfaces.IDistance;
import mise.marssa.data_types.float_datatypes.UnsignedFloat;

/**
 * @author Lifebook
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class ADistance extends UnsignedFloat implements IDistance {

	public ADistance(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}