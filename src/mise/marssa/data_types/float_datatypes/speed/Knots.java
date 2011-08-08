package mise.marssa.data_types.float_datatypes.speed;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */


public class Knots extends ASpeed {

	public Knots(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKnots() {
		return value;
	}

	public float getKPH() {
		return value * (float) 1.852;
	}
	
	public float getMPH(){
		return value * (float) (1.852 * (50.0 / 80.0));
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	public float getMPS() {
		return value * (float) 1.852 * 1000 / 3600;
	}
}