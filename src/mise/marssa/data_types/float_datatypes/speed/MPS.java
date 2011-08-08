package mise.marssa.data_types.float_datatypes.speed;

import mise.marssa.exceptions.OutOfRange;

/**
 * Meters per Second
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class MPS extends ASpeed {

	public MPS(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKnots() {
		return value * (float) 1.9438444924406;
	}

	public float getKPH() {
		return value * 3600 / 1000;
	}

	public float getMPH(){
		return value * (float) ((3600.0/1000.0) * (50.0/80.0));
	}
	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	public float getMPS() {
		return value;
	}
}