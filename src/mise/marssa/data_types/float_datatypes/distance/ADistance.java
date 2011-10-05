package mise.marssa.data_types.float_datatypes.distance;

import flexjson.JSONSerializer;
import mise.marssa.data_types.MString;
import mise.marssa.data_types.conversion_interfaces.IDistance;
import mise.marssa.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Lifebook
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class ADistance extends UnsignedFloat implements IDistance {

	public ADistance(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	
}