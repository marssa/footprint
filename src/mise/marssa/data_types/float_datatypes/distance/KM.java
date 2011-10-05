package mise.marssa.data_types.float_datatypes.distance;

import mise.marssa.exceptions.OutOfRange;

/**
 * Kilometres
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:20
 */
public class KM extends ADistance {

	public KM(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	
	public float getKM() {
		return this.value;
	}

	public float getMetres() {
		return value * 1000;
	}

	public float getMiles() {
		return value * (float) 0.621371192;
	}

	public float getNM() {
		return value * (float) 0.539956;
	}

	public float getFathoms() {
		return value * (float) 546.806649;
	}

}