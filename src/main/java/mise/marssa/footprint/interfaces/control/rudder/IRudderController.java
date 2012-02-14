/**
 * 
 */
package mise.marssa.footprint.interfaces.control.rudder;

import mise.marssa.footprint.datatypes.MBoolean;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.exceptions.NoConnection;

/**
 * @author Alan Grech
 *
 */
public interface IRudderController {
	public void rotate(MBoolean direction) throws InterruptedException, NoConnection;

	public MFloat getAngle() throws NoConnection;
}
