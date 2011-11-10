/**
 * 
 */
package mise.marssa.footprint.interfaces.control.rudder;

import mise.marssa.footprint.data_types.MBoolean;
import mise.marssa.footprint.data_types.float_datatypes.MFloat;
import mise.marssa.footprint.exceptions.NoConnection;

/**
 * @author Alan Grech
 *
 */
public interface IRudderController {
	public void rotate(MBoolean direction) throws InterruptedException, NoConnection;

	public MFloat getAngle() throws NoConnection;
}
