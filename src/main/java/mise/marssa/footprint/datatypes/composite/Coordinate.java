package mise.marssa.footprint.datatypes.composite;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Coordinate", factoryClass = TypeFactory.class, factoryMethod = "getCoordinateInstance")
public class Coordinate {
	
	private static Logger Coordinate = (Logger) LoggerFactory.getLogger("Coordinate");
	private Latitude latitude;
	private Longitude longitude;

	public Coordinate(Latitude latitude, Longitude longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
		Coordinate.trace(MMarker.CONSTRUCTOR,"Constructor created with  Latitude:\"{}\", Longitude:\"{}\"", latitude.toString(),longitude.toString());
	}

	public void finalize() throws Throwable {

	}
	@JSON
	@XmlElement
	public Latitude getLatitude() {
		Coordinate.trace(MMarker.GETTER,"Getting Latitude: {}.",latitude.toString());
		return latitude;
	}
	@JSON
	@XmlElement
	public Longitude getLongitude() {
		Coordinate.trace(MMarker.GETTER,"Getting Longitude: {}.",longitude.toString());
		return longitude;
	}

	public java.lang.String toString() {
		Coordinate.trace(MMarker.GETTER,"Getting Coordinate as a String");
		return "[" + latitude.toString() + ", " + longitude.toString() + "]";
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}

}
