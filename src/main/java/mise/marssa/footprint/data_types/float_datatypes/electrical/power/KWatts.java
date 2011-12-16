/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.electrical.power;

/**
 * @author Warren Zahra
 *
 */
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
