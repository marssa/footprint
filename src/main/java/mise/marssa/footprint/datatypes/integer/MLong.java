package mise.marssa.footprint.datatypes.integer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import flexjson.JSONSerializer;

/**
 * @author Clayton Tabone
 * @version 1.0
 * @created 22-Sep-2011 13:45:20
 */
@XmlType(name = "MLong", factoryClass = TypeFactory.class, factoryMethod = "getMLongInstance")
public class MLong {

	@XmlElement
	protected long value;

	public MLong(long value) {
		this.value = value;
	}

	public void finalize() throws Throwable {

	}

	public long getValue() {
		return value;
	}

	public java.lang.String toString() {
		return java.lang.Long.toString(value);
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
