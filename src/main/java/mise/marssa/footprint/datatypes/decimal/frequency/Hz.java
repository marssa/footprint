package mise.marssa.footprint.datatypes.decimal.frequency;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Hz", factoryClass = TypeFactory.class, factoryMethod = "getHzInstance")
@Entity
public class Hz extends AFrequency {

	private static Logger Hz = (Logger) LoggerFactory.getLogger("Hz");
	
	public Hz(float value) throws OutOfRange {
		super(value);
	}

	/**
	 * Hz is the SI unit
	 */
	@Override
	public float getHz() {
		Hz.trace(MMarker.GETTER,"Getting Hz: {}",value);
		return value;
	}

	@Override
	public float getKHz() {
		Hz.trace(MMarker.GETTER,"Converting from Hz to KHz : {}",value / 1000);
		return value / 1000;
	}
}