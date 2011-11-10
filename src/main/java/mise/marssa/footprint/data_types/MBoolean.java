package mise.marssa.footprint.data_types;

import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class MBoolean {
	protected boolean value;
	
	public MBoolean(boolean value) {
		this.value = value ;
	}
	
	public void setValue(boolean newValue)
	{
		this.value = newValue;
	}
	
	public void toggleValue()
	{
		this.value = !value;
	}
	@JSON
	public boolean getValue() {
		return value;
	}
	
	public String toString() {
		return Boolean.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().exclude("value").deepSerialize(this));
		return JSON;
	}
}