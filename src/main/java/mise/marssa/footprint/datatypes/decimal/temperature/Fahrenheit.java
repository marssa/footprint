package mise.marssa.footprint.datatypes.decimal.temperature;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Fahrenheit", factoryClass = TypeFactory.class, factoryMethod = "getFahrenheitInstance")
public class Fahrenheit extends ATemperature {

	public Fahrenheit(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		return (value - 32) * 5 / 9;
	}

	@Override
	public float getFahrenheit() {
		return value;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		return (value - 32) * 5 / 9 + 273;
	}

}