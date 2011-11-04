/**
 * 
 */
package mise.marssa.data_types.float_datatypes.electrical.current;

/**
 * @author Alan Grech
 *
 */
public class MilliAmps extends ACurrent {

	public MilliAmps(float value) {
		super(value);
	}

	public float getAmps() {
		return value / 1000;
	}

	public float getMilliAmps() {
		return value;
	}
}
