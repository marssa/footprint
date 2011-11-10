package mise.marssa.footprint.data_types.float_datatypes.speed;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Kilometres per hour
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class KPH extends ASpeed {

	public KPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getMPH(){
		return value * (50f / 80f);
	}

	@Override
	public float getKnots() {
		return value / 1.852f;
	}

	@Override
	public float getKPH() {
		return value;
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		return value * 1000f / 3600f;
	}
}