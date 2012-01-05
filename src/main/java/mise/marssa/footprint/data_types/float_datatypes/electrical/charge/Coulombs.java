/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.charge;

/**
 * @author Alan Grech
 *
 */
public class Coulombs extends ACharge {

	public Coulombs(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		return value / 3600;
	}

	@Override
	public float getmAh() {
		return value / (float) 3.6;
	}

	@Override
	public float getColoumbs() {
		return value;
	}
}
