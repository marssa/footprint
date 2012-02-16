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
@XmlType(name = "MOhms", factoryClass = TypeFactory.class, factoryMethod = "getMOhmsInstance")
public class MOhms extends AImpedance{

	private static Logger MOhms = (Logger) LoggerFactory.getLogger("MOhms");

	public MOhms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		MOhms.trace(MMarker.GETTER,"Converting from MOhms to Ohms : {}",value*1000000);
		return value*1000000;
	}

	@Override
	public float getKOhms() {
		MOhms.trace(MMarker.GETTER,"Converting from MOhms to KOhms : {}",value / 1000);
		return (value/1000);
	}

	@Override
	public float getMOhms() {
		MOhms.trace(MMarker.GETTER,"Getting MOhms: {}",value);
		return value;
	}

}
