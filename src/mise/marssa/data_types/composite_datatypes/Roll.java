package mise.marssa.data_types.composite_datatypes;

import mise.marssa.data_types.float_datatypes.DegreesFloat;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Roll {

	private DegreesFloat Roll;

	public Roll(DegreesFloat roll) {
		this.Roll = roll;
	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getRoll() {
		return Roll;
	}

	public java.lang.String toString() {
		return "";
	}
}