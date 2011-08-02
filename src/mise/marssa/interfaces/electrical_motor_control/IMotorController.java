package mise.marssa.interfaces.electrical_motor_control;

import mise.marssa.data_types.float_datatypes.speed.PercentSpeed;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface IMotorController {

	/**
	 * 
	 * @param motorSpeed
	 */
	public void outputMotorSpeed(PercentSpeed motorSpeed);

}
