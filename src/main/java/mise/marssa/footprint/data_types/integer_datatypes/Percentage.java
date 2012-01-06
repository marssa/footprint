package mise.marssa.footprint.data_types.integer_datatypes;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Percentage", factoryClass = TypeFactory.class, factoryMethod = "getPercentageInstance")
public class Percentage extends MInteger {

	public Percentage(int value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			throw new OutOfRange();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}