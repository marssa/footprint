/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.charge;

/**
 * @author Alan Grech
 *
 */
public class Coloumbs extends ACharge {

	public Coloumbs(float value) {
		super(value);
	}

	public float getAh() {
		return value / 3600;
	}

	public float getmAh() {
		return value / (float) 3.6;
	}

	public float getColoumbs() {
		return value;
	}

}
