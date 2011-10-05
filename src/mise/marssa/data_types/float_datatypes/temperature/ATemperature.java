package mise.marssa.data_types.float_datatypes.temperature;

import flexjson.JSONSerializer;
import mise.marssa.data_types.MString;
import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.data_types.conversion_interfaces.ITemperature;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
public abstract class ATemperature extends MFloat implements ITemperature {

	public ATemperature(float value) {
		super(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}