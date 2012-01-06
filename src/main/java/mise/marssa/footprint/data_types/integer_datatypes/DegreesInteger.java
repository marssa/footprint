package mise.marssa.footprint.data_types.integer_datatypes;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesInteger", factoryClass = TypeFactory.class, factoryMethod = "getDegreesIntegerInstance")
public class DegreesInteger extends MInteger {

	public DegreesInteger(int value) {
		super(value);
	}

	public void finalize() throws Throwable {
		super.finalize();
	}
	

}
