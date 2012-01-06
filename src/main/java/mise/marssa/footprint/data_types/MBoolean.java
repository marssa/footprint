package mise.marssa.footprint.data_types;

import javax.xml.bind.annotation.XmlElement;
import flexjson.JSON;import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MBoolean", factoryClass = TypeFactory.class, factoryMethod = "getMBooleanInstance")
public class MBoolean {
	@XmlElement
	protected boolean value;
	
	public MBoolean(boolean value) {
		this.value = value;
	}

	public MBoolean newMBoolean() {
		return new MBoolean(false);
	}
	public void setValue(boolean newValue) {
		this.value = newValue;
	}

	public void toggleValue() {
		this.value = !value;
	}

	@JSON
	public boolean getValue() {
		return value;
	}

	public String toString() {
		return Boolean.toString(value);
	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}