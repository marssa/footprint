/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

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
