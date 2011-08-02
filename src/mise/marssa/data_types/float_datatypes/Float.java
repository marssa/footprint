package mise.marssa.data_types.float_datatypes;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Float {

	protected float value;

	public Float(float value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}

	public float getValue() {
		return value;
	}

	public String toString() {
		return java.lang.Float.toString(value);
	}
}