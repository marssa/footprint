/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.power;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "APower", factoryClass = TypeFactory.class, factoryMethod = "getAPowerInstance")
public abstract class APower extends MFloat {
	public APower (float value) {
		super(value);
	}
	
	abstract public float getWatts();
	abstract public float getKWatts();
	abstract public float getMWatts();
	
	@Override
	public String toString() {
		return "Power in " + this.getClass().getSimpleName() + " = " + value;
	}
}
