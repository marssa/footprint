/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversion for: litres per minute
 */
public class LPM extends AVolumeFlow{

	public LPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 60;
	}

	@Override
	public float getLPM() {
		return value;
	}

	@Override
	public float getLPS() {
		return value / 60;
	}

	@Override
	public float getMCPS() {
		return value * (float) 0.001 / 60;
	}

	@Override
	public float getMCPM() {
		return value * (float) 0.001;
	}

	@Override
	public float getMCPH() {
		return value * (float) 0.001 * 60;
	}

	@Override
	public float getCFPS() {
		return value * (float) 0.00058857777022 ;
	}

	@Override
	public float getCFPM() {
		return value * (float) 0.035314666213 ;
	}

	@Override
	public float getCFPH() {
		return value * (float) 2.1188799728 ;
	}
	

}
