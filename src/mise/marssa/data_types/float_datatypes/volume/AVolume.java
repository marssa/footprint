/**
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.data_types.float_datatypes.volume;

import flexjson.JSONSerializer;
import mise.marssa.data_types.MString;
import mise.marssa.data_types.conversion_interfaces.IVolume;
import mise.marssa.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.exceptions.OutOfRange;

public abstract class AVolume extends UnsignedFloat implements IVolume {
	
	public AVolume(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}
