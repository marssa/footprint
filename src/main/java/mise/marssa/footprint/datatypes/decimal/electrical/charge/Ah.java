/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

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
@XmlType(name = "Ah", factoryClass = TypeFactory.class, factoryMethod = "getAhInstance")
@Entity
public class Ah extends ACharge{

	private static Logger Ah = (Logger) LoggerFactory.getLogger("Ah");
	
	public Ah(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		Ah.trace(MMarker.GETTER,"Getting Ah: {}",value);
		return value;
	}

	@Override
	public float getmAh() {
		Ah.trace(MMarker.GETTER,"Converting from Ah to mAh : {}",value * 1000);
		return value * 1000;
	}

	@Override
	public float getColoumbs() {
		Ah.trace(MMarker.GETTER,"Converting from Ah to Coulombs : {}",value * 3600);
		return value * 3600;
	}
}
