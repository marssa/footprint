package mise.marssa.data_types.float_datatypes.frequency;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class KHz extends AFrequency {

	public KHz(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	/**
	 * Hz is the SI unit
	 */
	public float getHz() {
		return value * 1000;
	}

	public float getKHz() {
		return value;
	}

}