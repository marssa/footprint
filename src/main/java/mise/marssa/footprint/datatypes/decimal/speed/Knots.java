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
 * @created 08-Jul-2011 09:53:25
 */

@XmlType(name = "Knots", factoryClass = TypeFactory.class, factoryMethod = "getKnotsInstance")
public class Knots extends ASpeed {

	private static Logger Knots = (Logger) LoggerFactory.getLogger("Knots");

	public Knots(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		Knots.trace(MMarker.GETTER,"Getting Knots: {}",value);
		return value;
	}

	@Override
	public float getKPH() {
		Knots.trace(MMarker.GETTER,"Converting from Knots to KPH : {}",value * (float) 1.852);
		return value * (float) 1.852;
	}

	@Override
	public float getMPH(){
		Knots.trace(MMarker.GETTER,"Converting from Knots to MPH : {}",value * (float) (1.852 * (50.0 / 80.0)));
		return value * (float) (1.852 * (50.0 / 80.0));
	}

	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		Knots.trace(MMarker.GETTER,"Converting from Knots to MPS : {}",value * (float) 1.852 * 1000 / 3600);
		return value * (float) 1.852 * 1000 / 3600;
	}
}