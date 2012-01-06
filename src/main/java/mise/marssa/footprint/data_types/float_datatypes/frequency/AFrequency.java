package mise.marssa.footprint.data_types.float_datatypes.frequency;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "AFrequency", factoryClass = TypeFactory.class, factoryMethod = "getAFrequencyInstance")
public abstract class AFrequency extends UnsignedFloat {

	public AFrequency(float value) throws OutOfRange {
		super(value);
	}
	
	/**
	 * Hz is the SI unit
	 */
	abstract public float getHz();

	abstract public float getKHz();
	
	@Override
	public String toString() {
		return "Frequency in " + this.getClass().getSimpleName() + " = " + value;
	}
}