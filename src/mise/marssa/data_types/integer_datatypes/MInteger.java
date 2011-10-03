package mise.marssa.data_types.integer_datatypes;

import mise.marssa.data_types.MString;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class MInteger {

	protected int value;

	public MInteger(int value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}
	@JSON
	public int getValue() {
		return value;
	}

	public java.lang.String toString() {
		return java.lang.Integer.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}