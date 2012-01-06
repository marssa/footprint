package mise.marssa.footprint.data_types.composite_datatypes;

import javax.xml.bind.annotation.XmlType;

import flexjson.JSONSerializer;
import mise.marssa.footprint.data_types.MString;
import mise.marssa.footprint.data_types.float_datatypes.DegreesFloat;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Roll", factoryClass = TypeFactory.class, factoryMethod = "getRollInstance")
public class Roll {

	private DegreesFloat Roll;

	public Roll(DegreesFloat roll) {
		this.Roll = roll;
	}

	public void finalize() throws Throwable {

	}

	public DegreesFloat getRoll() {
		return Roll;
	}

	public java.lang.String toString() {
		return "";
	}
	
	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}