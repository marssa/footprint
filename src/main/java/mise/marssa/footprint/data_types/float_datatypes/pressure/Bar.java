package mise.marssa.footprint.data_types.float_datatypes.pressure;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Bar extends APressure {

	public Bar(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return value;
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		return value / 1000;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		return value * (10 ^ -5);
	}

	@Override
	public float getMMHg() {
		return value * (float) 750.061683;
	}

	@Override
	public float getPSI() {
		return value * (float) 14.5037738;
	}

	@Override
	public float getKPa() {
		return value * (10 ^ 2);
	}
}