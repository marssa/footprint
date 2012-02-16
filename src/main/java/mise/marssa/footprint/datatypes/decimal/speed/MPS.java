package mise.marssa.footprint.datatypes.decimal.speed;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

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

	private static Logger MPS = (Logger) LoggerFactory.getLogger("MPS");

	public MPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKnots() {
		MPS.trace(MMarker.GETTER,"Converting from MPS to Knots : {}",value * (float) 1.9438444924406);
		return value * (float) 1.9438444924406;
	}

	@Override
	public float getKPH() {
		MPS.trace(MMarker.GETTER,"Converting from MPS to KPH : {}",value * 3600 / 1000);
		return value * 3600 / 1000;
	}

	@Override
	public float getMPH(){
		MPS.trace(MMarker.GETTER,"Converting from MPS to MPH : {}",value * (float) ((3600.0/1000.0) * (50.0/80.0)));
		return value * (float) ((3600.0/1000.0) * (50.0/80.0));
	}
	/**
	 * get metres per second. m/s is the SI unit but knots is more widely used
	 * as a nautical term
	 */
	@Override
	public float getMPS() {
		MPS.trace(MMarker.GETTER,"Getting MPS: {}",value);
		return value;
	}
}
