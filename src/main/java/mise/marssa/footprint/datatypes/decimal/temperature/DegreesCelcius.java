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
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesCelcius", factoryClass = TypeFactory.class, factoryMethod = "getDegreesCelciusInstance")
@Entity
public class DegreesCelcius extends ATemperature {

	private static Logger DegreesCelcius = (Logger) LoggerFactory.getLogger("DegreesCelcius");

	public DegreesCelcius(float value) {
		super(value);
	}

	@Override
	public float getDegreesCelcius() {
		DegreesCelcius.trace(MMarker.GETTER,"Getting DegreesCelcius: {}",value);
		return value;
	}

	@Override
	public float getFahrenheit() {
		DegreesCelcius.trace(MMarker.GETTER,"Converting from DegreeCelcius to Fahrenheit : {}",(value * 9f / 5f) + 32f);
		return (value * 9f / 5f) + 32f;
	}

	/**
	 * Kelvin is the SI Unit
	 */
	@Override
	public float getKelvin() {
		DegreesCelcius.trace(MMarker.GETTER,"Converting from DegreesCelcius to Kelvin : {}",value + 273.15f);
		return value + 273.15f;
	}
}