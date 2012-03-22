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
 * @created 08-Jul-2011 09:53:25
 */
@XmlType(name = "KHz", factoryClass = TypeFactory.class, factoryMethod = "getKHzInstance")
@Entity
public class KHz extends AFrequency {

	static Logger KHz = (Logger) LoggerFactory.getLogger("KHz");
	public KHz(float value) throws OutOfRange {
		super(value);
	}

	/**
	 * Hz is the SI unit
	 */
	@Override
	public float getHz() {
		KHz.trace(MMarker.GETTER,"Converting from KHz to Hz : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getKHz() {
		KHz.trace(MMarker.GETTER,"Getting KHz: {}",value);
		return value;
	}
}