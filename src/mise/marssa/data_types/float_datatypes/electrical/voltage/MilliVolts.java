/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.voltage;

/**
 * @author Lifebook
 *
 */
public class MilliVolts extends AVoltage {

	public MilliVolts(float value) {
		super(value);
	}

	public float getVolts() {
		return value / 1000;
	}

	public float getMilliVolts() {
		return value;
	}
}
