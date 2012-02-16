/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "MilliAmps", factoryClass = TypeFactory.class, factoryMethod = "getMilliAmpsInstance")
public class MilliAmps extends ACurrent {
	private static Logger MilliAmps = (Logger) LoggerFactory.getLogger("MilliAmps");

	public MilliAmps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		MilliAmps.trace(MMarker.GETTER,"Converting from MilliAmps to Amps : {}",value / 1000);
		return value / 1000;
	}

	@Override
	public float getMilliAmps() {
		MilliAmps.trace(MMarker.GETTER,"Getting MilliAmps: {}",value);
		return value;
	}
}
