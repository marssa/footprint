package mise.marssa.footprint.datatypes.decimal.frequency;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "KHz", factoryClass = TypeFactory.class, factoryMethod = "getKHzInstance")
public class KHz extends AFrequency {

	public KHz(float value) throws OutOfRange {
		super(value);
	}

	/**
	 * Hz is the SI unit
	 */
	@Override
	public float getHz() {
		return value * 1000;
	}

	@Override
	public float getKHz() {
		return value;
	}
}