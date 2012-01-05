/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.charge;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
public abstract class ACharge extends MFloat {

	public ACharge(float value) {
		super(value);
	}
	
	/**
	 * Ampere-hours
	 * @return
	 */
	abstract public float getAh();
	
	/**
	 * Milli Ampere-hours
	 * @return
	 */
	abstract public float getmAh();
	
	abstract public float getColoumbs();
	
	@Override
	public String toString() {
		return "Charge in " + this.getClass().getSimpleName() + " = " + value;
	}
}
