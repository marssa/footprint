package mise.marssa.data_types.conversion_interfaces;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public interface ITemperature {

	public float getDegreesCelcius();

	public float getFahrenheit();

	/**
	 * Kelvin is the SI Unit
	 */
	public float getKelvin();

}