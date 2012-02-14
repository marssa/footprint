package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * milli bars
 * 
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MBars", factoryClass = TypeFactory.class, factoryMethod = "getMBarsInstance")
public class MBars extends APressure {

	public MBars(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public void finalize() throws Throwable {
		super.finalize();
	}

	@Override
	public float getBars() {
		return value / 1000f;
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		return value;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		return value * 100f;
	}

	@Override
	public float getMMHg() {
		return value * 0.750061683f;
		
	}

	@Override
	public float getKPa() {
		return value / 10f;
	}

	@Override
	public float getPSI() {
		return value * 0.0145037738f;
	}
}