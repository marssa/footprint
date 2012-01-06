package mise.marssa.footprint.data_types.float_datatypes.pressure;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.data_types.float_datatypes.UnsignedFloat;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */

@XmlType(name = "APressure", factoryClass = TypeFactory.class, factoryMethod = "getAPressureInstance")
public abstract class APressure extends UnsignedFloat {

	public APressure(float value) throws OutOfRange {
		super(value);
	}
	
	abstract public float getBars();

	/**
	 * get Millibars
	 */
	abstract public float getMBars();

	/**
	 * Pascals is the SI unit equivalent to N/m^2
	 */
	abstract public float getPa();
	
	abstract public float getKPa(); //Kilo Pascals
	
	/**
	 * get Millimetres Mercury;
	 */
	abstract public float getMMHg();
	
	abstract public float getPSI();
	
	@Override
	public String toString() {
		return "Pressure in " + this.getClass().getSimpleName() + " = " + value;
	}
}