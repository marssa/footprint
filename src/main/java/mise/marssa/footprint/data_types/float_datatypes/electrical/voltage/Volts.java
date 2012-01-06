/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

import javax.xml.bind.annotation.XmlType;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Volts", factoryClass = TypeFactory.class, factoryMethod = "getVoltsInstance")
public class Volts extends AVoltage {

	public Volts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		return value;
	}

	@Override
	public float getMilliVolts() {
		return value * 1000f;
	}
}
