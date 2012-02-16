/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "Ohms", factoryClass = TypeFactory.class, factoryMethod = "getOhmsInstance")
public class Ohms extends AImpedance {

	private static Logger Ohms = (Logger) LoggerFactory.getLogger("Ohms");
	public Ohms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		Ohms.trace(MMarker.GETTER,"Getting Ohms: {}",value);
		return value;
	}

	@Override
	public float getKOhms() {
		Ohms.trace(MMarker.GETTER,"Converting from Ohms to KOhms : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMOhms() {
		Ohms.trace(MMarker.GETTER,"Converting from Ohms to MOhms : {}",value / 1000000);
		return (value/1000000);
	}

}
