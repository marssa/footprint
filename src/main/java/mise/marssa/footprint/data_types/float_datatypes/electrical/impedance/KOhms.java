/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.impedance;

/**
 * @author Warren Zahra
 *
 */
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
