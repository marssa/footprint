package mise.marssa.footprint.datatypes.composite;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Pitch", factoryClass = TypeFactory.class, factoryMethod = "getPitchInstance")
public class Pitch {

	private DegreesFloat Pitch;

	public Pitch(DegreesFloat pitch) {
		this.Pitch = pitch;

	}

	public void finalize() throws Throwable {

	}
	@XmlElement
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