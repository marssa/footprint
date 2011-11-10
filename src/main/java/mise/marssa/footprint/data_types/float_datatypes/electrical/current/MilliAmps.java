/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.current;

/**
 * @author Alan Grech
 *
 */
public class MilliAmps extends ACurrent {

	public MilliAmps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		return value / 1000;
	}

	@Override
	public float getMilliAmps() {
		return value;
	}
}
