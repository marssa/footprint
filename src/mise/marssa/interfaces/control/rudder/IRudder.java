/**
 * 
 */
package mise.marssa.interfaces.control.rudder;

/**
 * @author Alan Grech
 *
 */
public interface IRudder {
	public void rotateToPS() throws InterruptedException; //rotate to Portside (left side of the vessel facing forward)
	public void rotateToSB() throws InterruptedException; //rotate to Starboard (right side of the vessel facing forward)
}
