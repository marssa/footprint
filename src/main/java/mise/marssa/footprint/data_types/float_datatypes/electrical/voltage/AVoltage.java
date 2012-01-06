/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.voltage;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Lifebook
 *
 */
@XmlType(name = "AVoltage", factoryClass = TypeFactory.class, factoryMethod = "getAVoltageInstance")
public abstract class AVoltage extends MFloat {
	public AVoltage (float value) {
		super(value);
	}
	
	abstract public float getVolts();
	abstract public float getMilliVolts();
	
	@Override
	public String toString() {
		return "Voltage in " + this.getClass().getSimpleName() + " = " + value;
	}
}

