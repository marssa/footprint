/**
 * 
 */
package mise.marssa.data_types.conversion_interfaces;

/**
 * @author Alan Grech
 *
 */
public interface IVolumeFlow {
	
	public float getLPH(); //Litres per hour
	
	public float getLPM(); //Litres per minute
	
	public float getLPS(); //Litres per second
	
	public float getMCPS(); //Meters cubed per second (m^3/s)
	
	public float getMCPM(); //Meters cubed per minute
	
	public float getMCPH(); //Meters cuber per hour
	
	public float getCFPS(); //Cubic foot per second
	
	public float getCFPM(); //Cubic foot per minute
	
	public float getCFPH(); //cubic foot per hour
	
	//TODO US & UK gallons
	

}
