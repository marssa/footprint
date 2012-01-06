package mise.marssa.footprint.data_types.float_datatypes.temperature;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Kelvin", factoryClass = TypeFactory.class, factoryMethod = "getKelvinInstance")
public class Kelvin extends ATemperature {

	public Kelvin(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		return value - 273;
	}

	@Override
	public float getFahrenheit() {
		return ((value - 273) * 9 / 5) + 32;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		return value;
	}
}