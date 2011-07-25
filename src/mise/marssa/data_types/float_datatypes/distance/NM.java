package mise.marssa.data_types.float_datatypes.distance;

/**
 * Nautical Miles - most widely used as distance measurement in nautical terms
 * This datatype shall be used for depths as well
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:23
 */
public class NM extends ADistance {

	public NM(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKM() {
		return value * (float) 1.852;
	}

	public float getMetres() {
		return value * 1852;
	}

	public float getMiles() {
		return value * (float) 1.15077945;
	}

	public float getNM() {
		return value;
	}

	public float getFathoms() {
		return value * (float) 1012.68591;
	}

}