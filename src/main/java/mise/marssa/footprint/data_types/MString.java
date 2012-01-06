package mise.marssa.footprint.data_types;

<<<<<<< HEAD
import javax.xml.bind.annotation.XmlType;
=======
import javax.xml.bind.annotation.XmlElement;
>>>>>>> e6793184edce20f79824528fc623171fa3c16425

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MString", factoryClass = TypeFactory.class, factoryMethod = "getMStringInstance")
public class MString {
	@XmlElement
	private String contents;

	public MString(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		return contents;
	}

	public String toString() {
		return contents;
	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}