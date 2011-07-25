package mise.marssa.data_types.float_datatypes.distance;

/**
 * Metres is the SI Unit
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:22
 */
public class Metres extends ADistance {

	public Metres(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKM() {
		return value / 1000;
	}

	public float getMetres() {
		return value;
	}

	public float getMiles() {
		return value * (float) 0.000621371192;
	}

	public float getNM() {
		return value * (float) 0.000539956803;
	}

	public float getFathoms() {
		return value * (float) 0.546806649;
	}

}