/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MFloat;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "ACharge", factoryClass = TypeFactory.class, factoryMethod = "getAChargeInstance")
public abstract class ACharge extends MFloat {

	public ACharge(float value) {
		super(value);
	}
	
	/**
	 * Ampere-hours
	 * @return
	 */
	abstract public float getAh();
	
	/**
	 * Milli Ampere-hours
	 * @return
	 */
	abstract public float getmAh();
	
	abstract public float getColoumbs();
	
	@Override
	public String toString() {
		return "Charge in " + this.getClass().getSimpleName() + " = " + value;
	}
}
