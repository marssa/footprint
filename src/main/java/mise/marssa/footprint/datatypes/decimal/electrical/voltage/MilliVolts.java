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
@XmlType(name = "MilliVolts", factoryClass = TypeFactory.class, factoryMethod = "getMilliVoltsInstance")
public class MilliVolts extends AVoltage {

	private static Logger MilliVolts = (Logger) LoggerFactory.getLogger("MilliVolts");

	public MilliVolts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		MilliVolts.trace(MMarker.GETTER,"Converting from MilliVolts to Volts : {}",value / 1000f);
		return value / 1000f;
	}

	@Override
	public float getMilliVolts() {
		MilliVolts.trace(MMarker.GETTER,"Getting MilliVolts: {}",value);
		return value;
	}
}
