/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.charge;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Coulombs", factoryClass = TypeFactory.class, factoryMethod = "getCoulombsInstance")
public class Coulombs extends ACharge {

	public Coulombs(float value) {
		super(value);
	}

	@Override
	public float getAh() {
		return value / 3600;
	}

	@Override
	public float getmAh() {
		return value / (float) 3.6;
	}

	@Override
	public float getColoumbs() {
		return value;
	}
}
