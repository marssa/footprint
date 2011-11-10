/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.charge;

/**
 * @author Alan Grech
 *
 */
public class Ah extends ACharge{

	public Ah(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		return value;
	}

	@Override
	public float getmAh() {
		return value * 1000;
	}

	@Override
	public float getColoumbs() {
		return value * 3600;
	}
}
