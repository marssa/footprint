/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.current;

/**
 * @author Lifebook
 *
 */
public class Amps extends ACurrent {

	public Amps(float value) {
		super(value);
	}

	public float getAmps() {
		return value;
	}

	public float getMilliAmps() {
		return value * 1000;
	}


}
