/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

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
