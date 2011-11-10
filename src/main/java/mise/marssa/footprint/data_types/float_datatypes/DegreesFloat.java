package mise.marssa.footprint.data_types.float_datatypes;

import mise.marssa.footprint.data_types.MString;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class DegreesFloat extends MFloat {

	public DegreesFloat(float value) {
		super(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
	
}