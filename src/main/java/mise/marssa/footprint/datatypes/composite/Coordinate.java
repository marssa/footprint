package mise.marssa.footprint.datatypes.composite;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;

import org.hibernate.annotations.GenericGenerator;
import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "Coordinate", factoryClass = TypeFactory.class, factoryMethod = "getCoordinateInstance")
@Entity
@Table(name="Coordinate")
public class Coordinate {
	
	private static Logger Coordinate = (Logger) LoggerFactory.getLogger("Coordinate");
	@Column(name="Latitude")
	private Latitude latitude;
	@Column(name="Latitude")
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
	
	@Id
	@Column(name = "id")	
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	Long id;

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
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
