package mise.marssa.data_types.float_datatypes.distance;

/**
 * @author Alan Grech.grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Miles extends ADistance {

	public Miles(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKM() {
		return value * (float) 1.609344;
	}

	public float getMetres() {
		return value * (float) 1609.344;
	}

	public float getMiles() {
		return value;
	}

	public float getNM() {
		return value * (float) 0.868976242;
	}

	public float getFathoms() {
		return value *  880;
	}

}