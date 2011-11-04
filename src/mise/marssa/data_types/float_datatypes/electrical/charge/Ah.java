/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.charge;

/**
 * @author Alan Grech
 *
 */
public class Ah extends ACharge{

	public Ah(float value) {
		super(value);
	}

	public float getAh() {
		return value;
	}

	public float getmAh() {
		return value * 1000;
	}

	public float getColoumbs() {
		return value * 3600;
	}
	

}
