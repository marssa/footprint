/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

/**
 * @author Alan Grech
 *
 */
public class MilliVolts extends AVoltage {

	public MilliVolts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		return value / 1000f;
	}

	@Override
	public float getMilliVolts() {
		return value;
	}
}
