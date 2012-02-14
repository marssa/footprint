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
@XmlType(name = "MOhms", factoryClass = TypeFactory.class, factoryMethod = "getMOhmsInstance")
public class MOhms extends AImpedance{

	public MOhms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		return value*1000000;
	}

	@Override
	public float getKOhms() {
		return (value/1000);
	}

	@Override
	public float getMOhms() {
		return value;
	}

}