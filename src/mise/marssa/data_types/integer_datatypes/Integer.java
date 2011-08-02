package mise.marssa.data_types.integer_datatypes;

/**
 * @author Alan Grech Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Integer {

	protected int value;

	public Integer(int value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}

	public int getValue() {
		return value;
	}
	
	public java.lang.String toString() {
		return java.lang.Integer.toString(value);
	}
}