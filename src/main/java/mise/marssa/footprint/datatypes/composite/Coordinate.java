/*******************************************************************************
 * Copyright 2012 Marsec-XL Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
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
