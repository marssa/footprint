package mise.marssa.footprint.data_types.composite_datatypes;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:30
 */
@XmlType(name = "Yaw", factoryClass = TypeFactory.class, factoryMethod = "getYawInstance")
public class Yaw {

	private DegreesFloat Yaw;

	public Yaw(DegreesFloat yaw) {
		this.Yaw = yaw;
	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getYaw() {
		return Yaw;
	}

	public java.lang.String toString() {
		return "";
	}
	
	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}