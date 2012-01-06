/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.current;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "MilliAmps", factoryClass = TypeFactory.class, factoryMethod = "getMilliAmpsInstance")
public class MilliAmps extends ACurrent {

	public MilliAmps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		return value / 1000;
	}

	@Override
	public float getMilliAmps() {
		return value;
	}
}
