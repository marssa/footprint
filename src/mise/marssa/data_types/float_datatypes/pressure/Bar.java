package mise.marssa.data_types.float_datatypes.pressure;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Bar extends APressure {

	public Bar(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getBars() {
		return value;
	}

	/**
	 * get Milli Bars
	 */
	public float getMBars() {
		return value / 1000;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	public float getPa() {
		return value * (10 ^ -5);
	}

	public float getMMHg() {
		return value * (float) 750.061683;
		
	}

	public float getPSI() {
		return value * (float) 14.5037738;
		
	}

	public float getKPa() {
		return value * (10 ^ 2);
	}

}