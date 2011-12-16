/**
 * 
 */
package mise.marssa.footprint.interfaces.navigation_equipment;

/**
 * @author Warren Zahra
 *
 */
public interface ISensors {
	
public void initializeNewSentenceIDs();

public IDepthSensor getDepthSensor();

public ISpeedSensor getSpeedSensor();
}
