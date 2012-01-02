package mise.marssa.footprint.data_types.composite_datatypes;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
public class Pitch {

	private DegreesFloat Pitch;

	public Pitch(DegreesFloat pitch) {
		this.Pitch = pitch;

	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getPitch() {
		return Pitch;
	}

	public java.lang.String toString() {
		return "";
	}
	
	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}