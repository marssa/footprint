/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.current;

/**
 * @author Alan Grech
 *
 */
public class Amps extends ACurrent {

	public Amps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		return value;
	}

	@Override
	public float getMilliAmps() {
		return value * 1000;
	}
}
