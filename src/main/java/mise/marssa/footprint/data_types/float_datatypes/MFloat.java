package mise.marssa.footprint.data_types.float_datatypes;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.TypeFactory;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MFloat", factoryClass = TypeFactory.class, factoryMethod = "getMFloatInstance")
public class MFloat {

	@XmlElement
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
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
