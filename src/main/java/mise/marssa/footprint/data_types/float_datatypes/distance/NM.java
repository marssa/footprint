package mise.marssa.footprint.data_types.float_datatypes.distance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Nautical Miles - most widely used as distance measurement in nautical terms
 * This datatype shall be used for depths as well
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:23
 */
@XmlType(name = "Nm", factoryClass = TypeFactory.class, factoryMethod = "getNmInstance")
public class NM extends ADistance {

	public NM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		return value * (float) 1.852;
	}

	@Override
	public float getMetres() {
		return value * 1852;
	}

	@Override
	public float getMiles() {
		return value * (float) 1.15077945;
	}

	@Override
	public float getNM() {
		return value;
	}

	@Override
	public float getFathoms() {
		return value * (float) 1012.68591;
	}
}