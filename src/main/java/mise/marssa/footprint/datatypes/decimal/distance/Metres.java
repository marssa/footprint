package mise.marssa.footprint.datatypes.decimal.distance;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * Metres is the SI Unit
 * 
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:22
 */
@XmlType(name = "Metres", factoryClass = TypeFactory.class, factoryMethod = "getMetresInstance")
public class Metres extends ADistance {

	private static Logger Metres = (Logger) LoggerFactory.getLogger("Metres");
	
	public Metres(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Km: {}",value / 1000);
		return value / 1000;
	}

	@Override
	public float getMetres() {
		Metres.trace(MMarker.GETTER,"Getting Metres: {}",value);
		return value;
	}

	@Override
	public float getMiles() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Miles: {}",value * (float) 0.000621371192);
		return value * (float) 0.000621371192;
	}

	@Override
	public float getNM() {		
		Metres.trace(MMarker.GETTER,"Converting from Metres to NMiles: {}",value * (float) 0.000539956803);
		return value * (float) 0.000539956803;
	}

	@Override
	public float getFathoms() {
		Metres.trace(MMarker.GETTER,"Converting from Metres to Fathoms: {}",value * (float) 0.546806649);
		return value * (float) 0.546806649;
	}
}