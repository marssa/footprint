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
	public final static Marker GETTER = MarkerFactory.getMarker("GETTER");
	public final static Marker SETTER = MarkerFactory.getMarker("SET");
	public final static Marker CONNECTION = MarkerFactory.getMarker("CONNECTION");
	public final static Marker CONSTRUCTOR = MarkerFactory.getMarker("CONSTRUCTOR");
	public final static Marker JSONSERIALIZATION = MarkerFactory.getMarker("JSONSERIALIZATION");
	public final static Marker EXCEPTION = MarkerFactory.getMarker("EXCEPTION");

}
