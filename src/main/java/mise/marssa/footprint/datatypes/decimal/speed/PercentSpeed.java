package mise.marssa.footprint.datatypes.decimal.speed;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentSpeed", factoryClass = TypeFactory.class, factoryMethod = "getPercentSpeedInstance")
public class PercentSpeed extends ASpeed {

	public PercentSpeed(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		return 0;
	}

	@Override
	public float getKPH() {
		return 0;
	}
	
	@Override
	public float getMPH(){
		return 0;
	}

	/**
	 * get metres per second
	 */
	@Override
	public float getMPS() {
		return 0;
	}
}
