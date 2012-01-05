package mise.marssa.footprint.data_types.composite_datatypes;

import mise.marssa.footprint.data_types.MString;
import flexjson.JSON;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public class Coordinate {

	private Latitude latitude;
	private Longitude longitude;

	public Coordinate(Latitude latitude, Longitude longitude) {
		this.latitude = latitude;
		this.longitude = longitude;
	}

	public void finalize() throws Throwable {

	}
	@JSON
	public Latitude getLatitude() {
		return latitude;
	}
	@JSON
	public Longitude getLongitude() {
		return longitude;
	}

	public java.lang.String toString() {
		return "[" + latitude.toString() + ", " + longitude.toString() + "]";
	}
	public MString toJSON(){
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}

}
