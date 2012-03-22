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
@XmlType(name = "KWatts", factoryClass = TypeFactory.class, factoryMethod = "getKWattsInstance")
@Entity
public class KWatts extends APower{

	private static Logger KWatts = (Logger) LoggerFactory.getLogger("KWatts");

	public KWatts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		KWatts.trace(MMarker.GETTER,"Converting from KWatts to Watts : {}",value * 1000);
		return value*1000;
	}

	@Override
	public float getKWatts() {
		KWatts.trace(MMarker.GETTER,"Getting KWatts: {}",value);
		return value;
	}

	@Override
	public float getMWatts() {
		KWatts.trace(MMarker.GETTER,"Converting from KWatts to MWatts : {}",value / 1000);
		return (value/1000);
	}

	

}
