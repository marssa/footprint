/**
 * 
 */
package mise.marssa.data_types.float_datatypes.flow;

import mise.marssa.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per minute
 */
public class CFPM extends AVolumeFlow {

	public CFPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * (float) 1699.01082  ;
	}

	@Override
	public float getLPM() {
		return value * (float) 28.316846999;
	}

	@Override
	public float getLPS() {
		return value * (float) 0.47194745 ;
	}

	@Override
	public float getMCPS() {
		return value * (float) 0.00047194745 ;
	}

	@Override
	public float getMCPM() {
		return value * (float)  0.02831684699 ;
	}

	@Override
	public float getMCPH() {
		return value * (float)  1.69901082;
	}

	@Override
	public float getCFPS() {
		return value * (float) 0.016666666667;
	}

	@Override
	public float getCFPM() {
		// TODO Auto-generated method stub
		return value;
	}

	@Override
	public float getCFPH() {
		// TODO Auto-generated method stub
		return value * 60;
	}

}
