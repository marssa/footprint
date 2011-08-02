package mise.marssa.data_types.conversion_interfaces;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface ISpeed {

	public float getKnots();

	public float getKPH();

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	public float getMPS();
	
	public float getMPH();

}