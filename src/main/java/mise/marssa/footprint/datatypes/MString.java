package mise.marssa.footprint.datatypes;


import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MString", factoryClass = TypeFactory.class, factoryMethod = "getMStringInstance")
public class MString {
//	static Logger MString = (Logger) LoggerFactory.getLogger("MString");
	@XmlElement
	private String contents;

	public MString(String contents) {
		this.contents = contents;
	}

	public String getContents() {
	//	MString.trace(MMarker.GETTER,"Getting contents \"{}\"",contents);
		return contents;
	}

	public String toString() {
		//MString.trace(MMarker.GETTER,"Getting string as a String \"{}\"",contents);
		return contents;
	}

	public MString toJSON() {
		//MString.debug("JSON annotation ");
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}