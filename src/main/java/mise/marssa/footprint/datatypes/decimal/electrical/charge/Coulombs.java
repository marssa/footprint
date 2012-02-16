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
@XmlType(name = "Coulombs", factoryClass = TypeFactory.class, factoryMethod = "getCoulombsInstance")
public class Coulombs extends ACharge {

	private static Logger Coulombs = (Logger) LoggerFactory.getLogger("Coulombs");
	public Coulombs(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		Coulombs.trace(MMarker.GETTER,"Converting from Coulombs to Ah : {}",value / (float) 3.6);
		return value / 3600;
	}

	@Override
	public float getmAh() {
		Coulombs.trace(MMarker.GETTER,"Converting from Coulombs to mAh : {}",value / (float) 3.6);
		return value / (float) 3.6;
	}

	@Override
	public float getColoumbs() {
		Coulombs.trace(MMarker.GETTER,"Getting Coulombs: {}",value);
		return value;
	}
}
