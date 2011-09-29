/**
 * 
 */
package mise.marssa.interfaces.control.lighting;

import mise.marssa.exceptions.NoConnection;

/**
 * @author Alan Grech
 *
 */
public interface ILightToggle {
	
	public void toggleLight() throws NoConnection;

}
