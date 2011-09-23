package mise.marssa.data_types.integer_datatypes;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 22-Sep-2011 13:45:20
 */
public class MLong {

	protected long value;

	public MLong(long value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}

	public long getValue() {
		return value;
	}

	public java.lang.String toString() {
		return java.lang.Long.toString(value);
	}
}