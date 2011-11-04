/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.current;

import mise.marssa.data_types.conversion_interfaces.ICurrent;
import mise.marssa.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
public abstract class ACurrent extends MFloat implements ICurrent{
	public ACurrent (float value) {
		super(value);
	}
}
