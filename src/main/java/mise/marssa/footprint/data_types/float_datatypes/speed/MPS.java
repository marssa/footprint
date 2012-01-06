package mise.marssa.footprint.data_types.float_datatypes.speed;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * Meters per Second
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 * 
 * 
 */

@XmlType(name = "MPS", factoryClass = TypeFactory.class, factoryMethod = "getMPSInstance")
public class MPS extends ASpeed {

	public MPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		return value * (float) 1.9438444924406;
	}

	@Override
	public float getKPH() {
		return value * 3600 / 1000;
	}

	@Override
	public float getMPH(){
		return value * (float) ((3600.0/1000.0) * (50.0/80.0));
	}
	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		return value;
	}
}
