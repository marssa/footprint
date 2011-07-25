package mise.marssa.data_types.conversion_interfaces;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface IPressure {

	public float getBars();

	/**
	 * get Millibars
	 */
	public float getMBars();

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	public float getPa();
	
	public float getKPa(); //Kilo Pascals
	
	/**
	 * get Millimetres Mercury;
	 */
	public float getMMHg();
	
	public float getPSI();
	
}