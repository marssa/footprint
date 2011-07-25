package mise.marssa.data_types.float_datatypes.temperature;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Fahrenheit extends ATemperature {

	public Fahrenheit(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getDegreesCelcius() {
		return (value - 32) * 5 / 9;
	}

	public float getFahrenheit() {
		return value;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	public float getKelvin() {
		return (value - 32) * 5 / 9 + 273;
	}

}