package mise.marssa.footprint.data_types.float_datatypes.temperature;

import javax.xml.bind.annotation.XmlType;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ATemperature", factoryClass = TypeFactory.class, factoryMethod = "getATemperatureInstance")
public abstract class ATemperature extends MFloat {

	public ATemperature(float value) {
		super(value);
	}
	
	abstract public float getDegreesCelcius();

	abstract public float getFahrenheit();

	/**
	 * Kelvin is the SI Unit
	 */
	abstract public float getKelvin();
	
	@Override
	public String toString() {
		return "Temperature in " + this.getClass().getSimpleName() + " = " + value;
	}
}
