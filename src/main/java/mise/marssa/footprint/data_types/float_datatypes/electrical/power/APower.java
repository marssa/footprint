/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.power;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Warren Zahra
 *
 */
public abstract class APower extends MFloat {
	public APower (float value) {
		super(value);
	}
	
	abstract public float getWatts();
	abstract public float getKWatts();
	abstract public float getMWatts();
	
	@Override
	public String toString() {
		return "Power in " + this.getClass().getSimpleName() + " = " + value;
	}
}
