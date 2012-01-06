package mise.marssa.footprint.data_types.float_datatypes.distance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Kilometres
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:20
 */
@XmlType(name = "KM", factoryClass = TypeFactory.class, factoryMethod = "getKMInstance")
public class KM extends ADistance {

	public KM(float value) throws OutOfRange {
		super(value);
	}
	
	@Override
	public float getKM() {
		return this.value;
	}

	@Override
	public float getMetres() {
		return value * 1000;
	}

	@Override
	public float getMiles() {
		return value * (float) 0.621371192;
	}

	@Override
	public float getNM() {
		return value * (float) 0.539956;
	}

	@Override
	public float getFathoms() {
		return value * (float) 546.806649;
	}
}