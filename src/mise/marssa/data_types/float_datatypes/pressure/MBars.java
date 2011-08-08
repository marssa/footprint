package mise.marssa.data_types.float_datatypes.pressure;

import mise.marssa.exceptions.OutOfRange;

/**
 * milli bars
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class MBars extends APressure {

	public MBars(float value) throws OutOfRange {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getBars() {
		return value / 1000;
	}

	/**
	 * get Milli Bars
	 */
	public float getMBars() {
		return value;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	public float getPa() {
		return value * 100;
	}

	public float getMMHg() {
		return value * (float) 0.750061683;
		
	}

	public float getKPa() {
		return value / 10;
	}

	public float getPSI() {
		return value * (float) 0.0145037738;
	}
	
	

}