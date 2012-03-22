package mise.marssa.footprint.datatypes.decimal.temperature;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "Kelvin", factoryClass = TypeFactory.class, factoryMethod = "getKelvinInstance")
@Entity
public class Kelvin extends ATemperature {

	private static Logger Kelvin = (Logger) LoggerFactory.getLogger("Kelvin");

	public Kelvin(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		Kelvin.trace(MMarker.GETTER,"Converting from Kelvin to DegreesCelcius : {}",value - 273);
		return value - 273;
	}

	@Override
	public float getFahrenheit() {
		Kelvin.trace(MMarker.GETTER,"Converting from Kelvin to Fahrenheit : {}",((value - 273) * 9 / 5) + 32);
		return ((value - 273) * 9 / 5) + 32;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		Kelvin.trace(MMarker.GETTER,"Getting Kelvin: {}",value);
		return value;
	}
}