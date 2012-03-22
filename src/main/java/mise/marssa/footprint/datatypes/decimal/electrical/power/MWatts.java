/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;



/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "MWatts", factoryClass = TypeFactory.class, factoryMethod = "getMWattsInstance")
@Entity
public class MWatts extends APower{

	private static Logger MWatts = (Logger) LoggerFactory.getLogger("MWatts");

	public MWatts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		MWatts.trace(MMarker.GETTER,"Converting from MWatts to Watts : {}",value / 1000000);
		return value*1000000;
	}

	@Override
	public float getKWatts() {
		MWatts.trace(MMarker.GETTER,"Converting from MWatts to KWatts : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMWatts() {
		MWatts.trace(MMarker.GETTER,"Getting MWatts: {}",value);
		return value;
	}

}
