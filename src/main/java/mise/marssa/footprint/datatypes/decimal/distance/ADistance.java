package mise.marssa.footprint.datatypes.decimal.distance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Lifebook
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "ADistance", factoryClass = TypeFactory.class, factoryMethod = "getADistanceInstance")
public abstract class ADistance extends UnsignedFloat {

	public ADistance(float value) throws OutOfRange {
		super(value);
	}
	
	abstract public float getKM();

	abstract public float getMetres();

	abstract public float getMiles();

	abstract public float getNM();
	
	/**
	 * A fathom (abbreviation: ftm) is a unit of length in the imperial and the U.S. customary systems, used especially for measuring the depth of water.
	 * @return
	 */
	abstract public float getFathoms();
	
	@Override
	public String toString() {
		return "Distance in " + this.getClass().getSimpleName() + " = " + value;
	}
}