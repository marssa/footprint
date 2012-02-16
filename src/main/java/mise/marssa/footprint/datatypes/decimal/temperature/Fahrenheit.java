package mise.marssa.footprint.datatypes.decimal.temperature;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Fahrenheit", factoryClass = TypeFactory.class, factoryMethod = "getFahrenheitInstance")
public class Fahrenheit extends ATemperature {

	private static Logger Fahrenheit = (Logger) LoggerFactory.getLogger("Fahrenheit");

	public Fahrenheit(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		Fahrenheit.trace(MMarker.GETTER,"Converting from Fahrenheit to DegreesCelcius : {}",(value - 32) * 5 / 9);
		return (value - 32) * 5 / 9;
	}

	@Override
	public float getFahrenheit() {
		Fahrenheit.trace(MMarker.GETTER,"Getting Fahrenheit: {}",value);
		return value;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		Fahrenheit.trace(MMarker.GETTER,"Converting from Fahrenheit to Kelvin : {}",(value - 32) * 5 / 9 + 273);
		return (value - 32) * 5 / 9 + 273;
	}

}