/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Amps", factoryClass = TypeFactory.class, factoryMethod = "getAmpsInstance")
@Entity
public class Amps extends ACurrent {
	private static Logger Amps = (Logger) LoggerFactory.getLogger("Amps");

	public Amps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		Amps.trace(MMarker.GETTER,"Getting Amps: {}",value);
		return value;
	}

	@Override
	public float getMilliAmps() {
		Amps.trace(MMarker.GETTER,"Converting from Amps to MilliAmps : {}",value * 1000);
		return value * 1000;
	}
}
