/**
 * @author Warren Zahra
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
package mise.marssa.data_types.float_datatypes.volume;

import mise.marssa.data_types.conversion_interfaces.IVolume;
import mise.marssa.data_types.float_datatypes.UnsignedFloat;

public abstract class AVolume extends UnsignedFloat implements IVolume {
	
	public AVolume(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}
