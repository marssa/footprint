package mise.marssa.footprint.data_types.float_datatypes.temperature;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
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
	
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}