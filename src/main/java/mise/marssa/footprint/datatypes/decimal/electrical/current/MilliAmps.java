/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.current;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

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
