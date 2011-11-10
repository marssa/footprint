/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.current;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
public abstract class ACurrent extends MFloat {
	public ACurrent (float value) {
		super(value);
	}
	
	abstract public float getAmps();
	abstract public float getMilliAmps();
}
