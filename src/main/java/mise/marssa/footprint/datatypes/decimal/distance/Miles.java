package mise.marssa.footprint.datatypes.decimal.distance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech.grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Miles", factoryClass = TypeFactory.class, factoryMethod = "getMilesInstance")
public class Miles extends ADistance {

	public Miles(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		return value * (float) 1.609344;
	}

	@Override
	public float getMetres() {
		return value * (float) 1609.344;
	}

	@Override
	public float getMiles() {
		return value;
	}

	@Override
	public float getNM() {
		return value * (float) 0.868976242;
	}

	@Override
	public float getFathoms() {
		return value *  880;
	}
}