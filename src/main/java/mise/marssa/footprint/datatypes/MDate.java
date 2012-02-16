package mise.marssa.footprint.datatypes;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MDate", factoryClass = TypeFactory.class, factoryMethod = "getMDateInstance")
public class MDate extends java.util.Date {

	private static Logger MDate = (Logger) LoggerFactory.getLogger("MDate");

	private static final long serialVersionUID = 1L;

	// TODO See how an XML element can be added for the date
	public MDate(long date) {
		super(date);
		MDate.trace("Passing \"{}l\" to parent class Date", date);
	}

	public MString toJSON() {
		MDate.trace("JSON annotation ");
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}
