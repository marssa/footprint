package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "Pascals", factoryClass = TypeFactory.class, factoryMethod = "getPascalsInstance")
public class Pascals extends APressure {

	public Pascals(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		return (float) (value * Math.pow(10, -5));
	}

	/**
	 * get Milli Bars
	 */
	@Override
	public float getMBars() {
		return value * 1000f;
	}

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	@Override
	public float getPa() {
		return value;
	}

	@Override
	public float getMMHg() {
		return value * 0.00750061683f;
	}

	@Override
	public float getKPa() {
		return value / 1000f;
	}

	@Override
	public float getPSI() {
		return value * 0.000145037738f;
	}
}