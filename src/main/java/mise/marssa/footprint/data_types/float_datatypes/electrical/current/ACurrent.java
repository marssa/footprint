/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.current;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "ACurrent", factoryClass = TypeFactory.class, factoryMethod = "getACurrentInstance")
public abstract class ACurrent extends MFloat {
	public ACurrent (float value) {
		super(value);
	}
	
	abstract public float getAmps();
	abstract public float getMilliAmps();
	
	@Override
	public String toString() {
		return "Current in " + this.getClass().getSimpleName() + " = " + value;
	}
}
