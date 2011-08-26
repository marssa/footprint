/**
 * 
 */
package mise.marssa.interfaces.control.rudder;

import mise.marssa.data_types.MBoolean;

/**
 * @author Alan Grech
 *
 */
public interface IRudder {
	public void rotate(MBoolean direction) throws InterruptedException; 
}
