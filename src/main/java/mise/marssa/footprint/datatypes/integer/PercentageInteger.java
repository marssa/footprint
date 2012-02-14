package mise.marssa.footprint.datatypes.integer;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentageInteger", factoryClass = TypeFactory.class, factoryMethod = "getPercentageIntegerInstance")
public class PercentageInteger extends MInteger {

	public PercentageInteger(int value) throws OutOfRange {
		super(value);
		if((value < -100f) || (value > 100f))
			throw new OutOfRange();
	}

	public void finalize() throws Throwable {
		super.finalize();
	}

}