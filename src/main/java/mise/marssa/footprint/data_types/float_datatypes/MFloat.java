package mise.marssa.footprint.data_types.float_datatypes;

import mise.marssa.footprint.data_types.MString;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class MFloat {

	protected float value;

	public MFloat(float value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}
	@JSON
	public float getValue() {
		return value;
	}

	public String toString() {
		return java.lang.Float.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}