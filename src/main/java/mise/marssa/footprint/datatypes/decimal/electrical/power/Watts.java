/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;


/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "Watts", factoryClass = TypeFactory.class, factoryMethod = "getWattsInstance")
public class Watts extends APower {

	private static Logger Watts = (Logger) LoggerFactory.getLogger("Watts");

	public Watts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		Watts.trace(MMarker.GETTER,"Getting Watts: {}",value);
		return value;
	}

	@Override
	public float getKWatts() {
		Watts.trace(MMarker.GETTER,"Converting from Watts to KWatts : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMWatts() {
		Watts.trace(MMarker.GETTER,"Converting from Watts to MWatts : {}",value / 1000000);
		return (value/1000000);
	}

}
