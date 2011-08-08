package mise.marssa.data_types.float_datatypes.speed;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class PercentSpeed extends ASpeed {

	public PercentSpeed(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getKnots() {
		return 0;
	}

	public float getKPH() {
		return 0;
	}
	
	public float getMPH(){
		return 0;
	}

	/**
	 * get metres per second
	 */
	public float getMPS() {
		return 0;
	}

}