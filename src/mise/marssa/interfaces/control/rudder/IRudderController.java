/**
 * 
 */
package mise.marssa.interfaces.control.rudder;

import java.io.IOException;

import mise.marssa.data_types.MBoolean;
import mise.marssa.data_types.float_datatypes.MFloat;

/**
 * @author Alan Grech
 *
 */
public interface IRudderController {
	public void rotate(MBoolean direction) throws InterruptedException;

	public MFloat getAngle() throws IOException;
}
