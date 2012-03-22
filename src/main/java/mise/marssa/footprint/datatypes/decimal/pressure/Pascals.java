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
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Pascals", factoryClass = TypeFactory.class, factoryMethod = "getPascalsInstance")
@Entity
public class Pascals extends APressure {

	private static Logger Pascals = (Logger) LoggerFactory.getLogger("Pascals");

	public Pascals(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to Bars : {}",(float) (value * Math.pow(10, -5)));
		return (float) (value * Math.pow(10, -5));
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to MBars : {}",value * 1000f);
		return value * 1000f;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		Pascals.trace(MMarker.GETTER,"Getting Pascals: {}",value);
		return value;
	}

	@Override
	public float getMMHg() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to MMHg : {}",value * 0.00750061683f);
		return value * 0.00750061683f;
	}

	@Override
	public float getKPa() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to KPa : {}",value / 1000f);
		return value / 1000f;
	}

	@Override
	public float getPSI() {
		Pascals.trace(MMarker.GETTER,"Converting from Pascals to PSI : {}",value * 0.000145037738f);
		return value * 0.000145037738f;
	}
}