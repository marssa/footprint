/**
 * 
 */
package mise.marssa.footprint.logger;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @author Warren Zahra
 *
 */
public final class MMarker {
	
	public final static Marker FATAL = MarkerFactory.getMarker("FATAL");
	public final static Marker ALARM = MarkerFactory.getMarker("ALARM");
	public final static Marker GETTER = MarkerFactory.getMarker("RETURN");
	public final static Marker SETTER = MarkerFactory.getMarker("SET");
}
