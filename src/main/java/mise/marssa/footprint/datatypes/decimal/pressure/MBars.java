package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * milli bars
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MBars", factoryClass = TypeFactory.class, factoryMethod = "getMBarsInstance")
@Entity
public class MBars extends APressure {

	private static Logger MBars = (Logger) LoggerFactory.getLogger("MBars");

	public MBars(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public float getBars() {
		MBars.trace(MMarker.GETTER,"Converting from MBars to Bars : {}",value / 1000f);
		return value / 1000f;
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		MBars.trace(MMarker.GETTER,"Getting MBars: {}",value);
		return value;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		MBars.trace(MMarker.GETTER,"Converting from MBars to Pascals : {}",value * 100f);
		return value * 100f;
	}

	@Override
	public float getMMHg() {
		MBars.trace(MMarker.GETTER,"Converting from MBars to MMHg : {}",value * 0.750061683f);
		return value * 0.750061683f;
		
	}

	@Override
	public float getKPa() {
		MBars.trace(MMarker.GETTER,"Converting from MBars to Kpa : {}",value / 10f);
		return value / 10f;
	}

	@Override
	public float getPSI() {
		MBars.trace(MMarker.GETTER,"Converting from MBars to PSI : {}",value * 0.0145037738f);
		return value * 0.0145037738f;
	}
}