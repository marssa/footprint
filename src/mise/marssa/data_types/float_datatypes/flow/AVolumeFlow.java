/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.data_types.conversion_interfaces.IFlow;
import mise.marssa.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 *
 */
public abstract class AVolumeFlow extends UnsignedFloat implements IFlow {

	/**
	 * 
	 */
	public AVolumeFlow(float value) throws OutOfRange{
		
		super(value);
	}
	
	public void finalize() throws Throwable {
		super.finalize();
	}
}
