/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.power;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;


/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "Watts", factoryClass = TypeFactory.class, factoryMethod = "getWattsInstance")
public class Watts extends APower {

	public Watts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		return value;
	}

	@Override
	public float getKWatts() {
		return (value/1000);
	}

	@Override
	public float getMWatts() {
		return (value/1000000);
	}

}
