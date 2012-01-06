package mise.marssa.footprint.data_types;

import javax.xml.bind.annotation.XmlType;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MDate", factoryClass = TypeFactory.class, factoryMethod = "getMDateInstance")
public class MDate extends java.util.Date {

	
	
	private static final long serialVersionUID = 1L;

	//TODO See how an XML element can be added for the date
	public MDate(long date) {
		super(date);
	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}
