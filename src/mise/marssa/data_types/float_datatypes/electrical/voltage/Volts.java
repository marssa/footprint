/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.voltage;

/**
 * @author Alan Grech
 *
 */
public class Volts extends AVoltage {

	public Volts(float value) {
		super(value);
	}

	public float getVolts() {
		return value;
	}

	public float getMilliVolts() {
		return value * 1000;
	}
}
