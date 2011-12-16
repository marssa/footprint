/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.impedance;

/**
 * @author Warren Zahra
 *
 */
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