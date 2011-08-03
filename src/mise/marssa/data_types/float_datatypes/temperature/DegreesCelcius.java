package mise.marssa.data_types.float_datatypes.temperature;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class DegreesCelcius extends ATemperature {

	public DegreesCelcius(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getDegreesCelcius() {
		return value;
	}

	public float getFahrenheit() {

		return (value * 9 / 5) + 32;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	public float getKelvin() {
		return value + 273;
	}
}