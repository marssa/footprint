/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.power;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "KWatts", factoryClass = TypeFactory.class, factoryMethod = "getKWattsInstance")
public class KWatts extends APower{

	public KWatts(float value) {
		super(value);
	}

	@Override
	public float getWatts() {
		return value*1000;
	}

	@Override
	public float getKWatts() {
		return value;
	}

	@Override
	public float getMWatts() {
		return (value/1000);
	}

	

}
