/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.voltage;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Volts", factoryClass = TypeFactory.class, factoryMethod = "getVoltsInstance")
public class Volts extends AVoltage {

	private static Logger Volts = (Logger) LoggerFactory.getLogger("Volts");

	public Volts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		Volts.trace(MMarker.GETTER,"Getting Volts: {}",value);
		return value;
	}

	@Override
	public float getMilliVolts() {
		Volts.trace(MMarker.GETTER,"Converting from Volts to MilliVolts : {}",value * 1000f);
		return value * 1000f;
	}
}
