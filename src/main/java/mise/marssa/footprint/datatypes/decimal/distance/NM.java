package mise.marssa.footprint.datatypes.decimal.distance;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * Nautical Miles - most widely used as distance measurement in nautical terms
 * This datatype shall be used for depths as well
 * @author Lifebook
 * @version 1.0
 * @updated 08-Jul-2011 15:00:23
 */
@XmlType(name = "Nm", factoryClass = TypeFactory.class, factoryMethod = "getNmInstance")
@Entity
public class NM extends ADistance {

	private static Logger Nm = (Logger) LoggerFactory.getLogger("Nm");
	public NM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getKM() {
		Nm.trace(MMarker.GETTER,"Converting from Nm to Km : {}",value * (float) 1.852);
		return value * (float) 1.852;
	}

	@Override
	public float getMetres() {
		Nm.trace(MMarker.GETTER,"Converting from Nm to Metres : {}",value * (float) 1852);
		return value * 1852;
	}

	@Override
	public float getMiles() {
		Nm.trace(MMarker.GETTER,"Converting from Nm to Miles : {}",value * (float) 1.15077945);
		return value * (float) 1.15077945;
	}

	@Override
	public float getNM() {
		Nm.trace(MMarker.GETTER,"Getting Nm: {}",value);
		return value;
	}

	@Override
	public float getFathoms() {
		Nm.trace(MMarker.GETTER,"Converting from Nm to Fathoms : {}",value * (float) 1012.68591);
		return value * (float) 1012.68591;
	}
}