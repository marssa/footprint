package mise.marssa.interfaces.user_interface;

import mise.marssa.data_types.float_datatypes.speed.PercentSpeed;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface IMotorUI {

	public PercentSpeed getMotorSpeed();

	/**
	 * 
	 * @param desiredMotorSpeed
	 */
	public void setMotorSpeed(PercentSpeed desiredMotorSpeed);

}