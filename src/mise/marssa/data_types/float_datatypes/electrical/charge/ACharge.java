/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.charge;

import mise.marssa.data_types.conversion_interfaces.ICharge;
import mise.marssa.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
public abstract class ACharge extends MFloat implements ICharge {

	public ACharge(float value) {
		super(value);
	}
}
