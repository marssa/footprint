/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

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
@XmlType(name = "KOhms", factoryClass = TypeFactory.class, factoryMethod = "getKOhmsInstance")
@Entity
public class KOhms extends AImpedance{

	private static Logger KOhms = (Logger) LoggerFactory.getLogger("KOhms");

	public KOhms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		KOhms.trace(MMarker.GETTER,"Converting from KOhms to Ohms : {}",value / 1000);
		return value*1000;
	}

	@Override
	public float getKOhms() {
		KOhms.trace(MMarker.GETTER,"Getting KOhms: {}",value);
		return value;
	}

	@Override
	public float getMOhms() {
		KOhms.trace(MMarker.GETTER,"Converting from KOhms to MOhms : {}",value / 1000);
		return (value/1000);
	}

	

}
