/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.impedance;

/**
 * @author Warren Zahra
 *
 */
public class Ohms extends AImpedance {

	public Ohms(float value) {
		super(value);
	}

	@Override
	public float getOhms() {
		return value;
	}

	@Override
	public float getKOhms() {
		return (value/1000);
	}

	@Override
	public float getMOhms() {
		return (value/1000000);
	}

}
