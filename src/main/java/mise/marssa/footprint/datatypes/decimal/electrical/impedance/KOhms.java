/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.impedance;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "KOhms", factoryClass = TypeFactory.class, factoryMethod = "getKOhmsInstance")
public class KOhms extends AImpedance{

	public KOhms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		return value*1000;
	}

	@Override
	public float getKOhms() {
		return value;
	}

	@Override
	public float getMOhms() {
		return (value/1000);
	}

	

}
