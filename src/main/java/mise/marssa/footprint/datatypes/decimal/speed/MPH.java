package mise.marssa.footprint.datatypes.decimal.speed;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 10:52:23
 */

@XmlType(name = "MPH", factoryClass = TypeFactory.class, factoryMethod = "getMPHInstance")
public class MPH extends ASpeed{
	
	private static Logger MPH = (Logger) LoggerFactory.getLogger("MPH");

	public MPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKPH() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to KPH : {}",value *(float) 1.609);
		return value *(float) 1.609;
	}

	@Override
	public float getMPH() {
		MPH.trace(MMarker.GETTER,"Getting MPH: {}",value);
		return value;
	}

	@Override
	public float getKnots() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to Knots : {}",(value * (float)1.609) / ((float) 1.852));
		return (value * (float)1.609) / ((float) 1.852);
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		MPH.trace(MMarker.GETTER,"Converting from MPH to MPS : {}",value * ((float) 1.609)*1000 / 3600);
		return value * ((float) 1.609)*1000 / 3600;
	}
}
