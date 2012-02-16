/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "mAh", factoryClass = TypeFactory.class, factoryMethod = "getmAhInstance")
public class mAh extends ACharge {
	private static Logger mAh = (Logger) LoggerFactory.getLogger("mAh");

	public mAh(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		mAh.trace(MMarker.GETTER,"Converting from mAh to Ah : {}",value / 1000);
		return value / 1000;
	}

	@Override
	public float getmAh() {
		mAh.trace(MMarker.GETTER,"Getting mAh: {}",value);
		return value;
	}

	@Override
	public float getColoumbs() {
		mAh.trace(MMarker.GETTER,"Converting from mAh to Coulombs : {}",value * (float) 3.6);
		return value * (float) 3.6;
	}
}
