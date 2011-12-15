/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.impedance;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Warren Zahra
 *
 */
public abstract class AImpedance extends MFloat {
	public AImpedance (float value) {
		super(value);
	}
	
	abstract public float getOhms();
	abstract public float getKOhms();
	abstract public float getMOhms();

}
