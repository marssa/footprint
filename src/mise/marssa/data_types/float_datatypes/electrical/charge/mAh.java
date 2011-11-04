/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.charge;

/**
 * @author Alan Grech
 *
 */
public class mAh extends ACharge {

	public mAh(float value) {
		super(value);
	}

	public float getAh() {
		return value / 1000;
	}

	public float getmAh() {
		return value;
	}

	public float getColoumbs() {
		return value * (float) 3.6;
	}
}
