package mise.marssa.footprint.data_types.float_datatypes.temperature;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesCelsius", factoryClass = TypeFactory.class, factoryMethod = "getDegreesCelsiusInstance")
public class DegreesCelcius extends ATemperature {

	public DegreesCelcius(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		return value;
	}

	@Override
	public float getFahrenheit() {
		return (value * 9f / 5f) + 32f;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		return value + 273.15f;
	}
}