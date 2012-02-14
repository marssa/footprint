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
@XmlType(name = "Amps", factoryClass = TypeFactory.class, factoryMethod = "getAmpsInstance")
public class Amps extends ACurrent {

	public Amps(float value) {
		super(value);
	}

	@Override
	public float getAmps() {
		return value;
	}

	@Override
	public float getMilliAmps() {
		return value * 1000;
	}
}
