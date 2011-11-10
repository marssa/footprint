/**
 * 
 */
package mise.marssa.footprint.interfaces.control.lighting;

import mise.marssa.footprint.exceptions.NoConnection;

/**
 * @author Alan Grech
 *
 */
public interface ILightToggle {
	
	public void toggleLight() throws NoConnection;

}
