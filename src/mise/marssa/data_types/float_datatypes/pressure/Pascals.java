package mise.marssa.data_types.float_datatypes.pressure;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Pascals extends APressure {

	public Pascals(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getBars() {
		
		return (float) ((float) value * Math.pow(10, -5));
	}

	/**
	 * get Milli Bars
	 */
	public float getMBars() {
		return value * 1000;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	public float getPa() {
		return value;
	}

	public float getMMHg() {
		return value * (float) 0.00750061683;
		
	}

	public float getKPa() {
		// TODO Auto-generated method stub
		return value/1000;
	}

	public float getPSI() {
		return value * (float) 0.000145037738;
	}

}