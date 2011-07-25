package mise.marssa.data_types.float_datatypes.temperature;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
public class Kelvin extends ATemperature {

	public Kelvin(float value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

	public float getDegreesCelcius() {
		return value - 273;
	}

	public float getFahrenheit() {
		return ((value - 273) * 9 / 5) + 32;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	public float getKelvin() {
		return value;
	}

}