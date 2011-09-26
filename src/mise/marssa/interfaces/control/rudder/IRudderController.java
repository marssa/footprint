/**
 * 
 */
package mise.marssa.interfaces.control.rudder;

import mise.marssa.data_types.MBoolean;
import mise.marssa.data_types.float_datatypes.MFloat;
import mise.marssa.exceptions.NoConnection;

/**
 * @author Alan Grech
 *
 */
public interface IRudderController {
	public void rotate(MBoolean direction) throws InterruptedException;

	public MFloat getAngle() throws NoConnection;
}
