package mise.marssa.footprint.datatypes.decimal.distance;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * Kilometres
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:20
 */
@XmlType(name = "KM", factoryClass = TypeFactory.class, factoryMethod = "getKMInstance")
public class KM extends ADistance {

	private static Logger Km = (Logger) LoggerFactory.getLogger("Km");

	public KM(float value) throws OutOfRange {
		super(value);
	}
	
	@Override
	public float getKM() {
		Km.trace(MMarker.GETTER,"Getting Km: {}",value);
		return this.value;
	}

	@Override
	public float getMetres() {
		Km.trace(MMarker.GETTER,"Converting from Km to Metres : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getMiles() {
		Km.trace(MMarker.GETTER,"Converting from Km to Miles : {}",value * (float) 0.621371192);
		return value * (float) 0.621371192;
	}

	@Override
	public float getNM() {
		Km.trace(MMarker.GETTER,"Converting from Km to NMiles : {}",value * (float) 0.539956);
		return value * (float) 0.539956;
	}

	@Override
	public float getFathoms() {
		Km.trace(MMarker.GETTER,"Converting from Km to Fathoms : {}",value * (float) 546.806649);
		return value * (float) 546.806649;
	}
}