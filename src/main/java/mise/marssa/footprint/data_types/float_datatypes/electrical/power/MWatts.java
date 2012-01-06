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
@XmlType(name = "MWatts", factoryClass = TypeFactory.class, factoryMethod = "getMWattsInstance")
public class MWatts extends APower{

	public MWatts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		return value*1000000;
	}

	@Override
	public float getKWatts() {
		return (value/1000);
	}

	@Override
	public float getMWatts() {
		return value;
	}

}
