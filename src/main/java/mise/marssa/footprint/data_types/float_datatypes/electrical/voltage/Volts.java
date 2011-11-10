/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

/**
 * @author Alan Grech
 *
 */
public class Volts extends AVoltage {

	public Volts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		return value;
	}

	@Override
	public float getMilliVolts() {
		return value * 1000f;
	}
}
