package mise.marssa.footprint.datatypes;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MBoolean", factoryClass = TypeFactory.class, factoryMethod = "getMBooleanInstance")
public class MBoolean {
	private static Logger MBoolean = (Logger) LoggerFactory.getLogger("MBoolean");
	protected boolean value;
	
	public MBoolean(boolean value) {
		MBoolean.trace(MMarker.CONSTRUCTOR,"Constructor created with Value:\"{}\".",value);
		this.value = value;
	}

	
	public void setValue(boolean newValue) {
		MBoolean.trace(MMarker.SETTER,"Setting MBoolean value to \"{}\".",newValue);
		this.value = newValue;
	}

	public void toggleValue() {
		this.value = !value;
		MBoolean.trace(MMarker.SETTER,"Value toggled to \"{}\".",value);
	}

	@JSON
	@XmlElement
	public boolean getValue() {
		MBoolean.trace(MMarker.GETTER,"Getting value: \"{}\"",value);
		return value;
	}

	public String toString() {
		MBoolean.trace(MMarker.GETTER,"Getting value as a String: \"{}\"",value);
		return Boolean.toString(value);
	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}