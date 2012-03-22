package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Bar", factoryClass = TypeFactory.class, factoryMethod = "getBarInstance")
@Entity
public class Bar extends APressure {

	private static Logger Bar = (Logger) LoggerFactory.getLogger("Bar");
	public Bar(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		Bar.trace(MMarker.GETTER,"Getting Bar: {}",value);
		return value;
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MBars : {}",value / 1000);
		return value / 1000;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MBars : {}",value * (10 ^ -5));
		return value * (10 ^ -5);
	}

	@Override
	public float getMMHg() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to MMHg : {}",value * (float) 750.061683);
		return value * (float) 750.061683;
	}

	@Override
	public float getPSI() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to PSI : {}",value * (float) 14.5037738);
		return value * (float) 14.5037738;
	}

	@Override
	public float getKPa() {
		Bar.trace(MMarker.GETTER,"Converting from Bar to KPa : {}",value * (10 ^ 2));
		return value * (10 ^ 2);
	}
}