/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.voltage;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "MilliVolts", factoryClass = TypeFactory.class, factoryMethod = "getMilliVoltsInstance")
public class MilliVolts extends AVoltage {

	public MilliVolts(float value) {
		super(value);
	}

	@Override
	public float getVolts() {
		return value / 1000f;
	}

	@Override
	public float getMilliVolts() {
		return value;
	}
}
