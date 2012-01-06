/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.charge;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "mAh", factoryClass = TypeFactory.class, factoryMethod = "getmAhInstance")
public class mAh extends ACharge {

	public mAh(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		return value / 1000;
	}

	@Override
	public float getmAh() {
		return value;
	}

	@Override
	public float getColoumbs() {
		return value * (float) 3.6;
	}
}
