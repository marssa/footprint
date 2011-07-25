package mise.marssa.data_types.float_datatypes.speed;

public class MPH extends ASpeed{
	
	public MPH(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	
	public float getKPH() {
		return value *(float) 1.609;
	}
	
	public float getMPH() {
		return value;
	}

	public float getKnots() {
		return (value * (float)1.609) / ((float) 1.852);
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	public float getMPS() {
		return value * ((float) 1.609)*1000 / 3600;
	}

	
}
