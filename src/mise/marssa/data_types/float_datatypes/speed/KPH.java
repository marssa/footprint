package mise.marssa.data_types.float_datatypes.speed;

/**
 * kilometres per hour
 * 
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class KPH extends ASpeed {

	public KPH(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	
	public float getMPH(){
		return value * (float) (50.0 / 80.0);
	}

	public float getKnots() {
		return value / (float) 1.852;
	}

	public float getKPH() {
		return value;
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	public float getMPS() {
		return value * 1000 / 3600;
	}

}