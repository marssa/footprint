/**
 * Copyright 2012 MARSEC-XL International Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package mise.marssa.footprint.interfaces.navigation;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MDate;
import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.composite.Coordinate;
import mise.marssa.footprint.datatypes.decimal.DegreesDecimal;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.decimal.distance.Metres;
import mise.marssa.footprint.datatypes.decimal.speed.Knots;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.datatypes.time.ATime;
import mise.marssa.footprint.exceptions.NoConnection;
import mise.marssa.footprint.exceptions.NoValue;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.interfaces.IQuantity;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface IGpsReceiver {

	public DegreesInteger getAzimuth();

	/**
	 * Course Over Ground
	 * 
	 * @throws NoConnection
	 * @throws NoValue
	 */
	public DegreesDecimal getCOG() throws NoConnection, NoValue;

	public Coordinate getCoordinate() throws NoConnection, NoValue, OutOfRange;

	public MDate getDate() throws NoConnection, NoValue;

	public Metres getAltitude() throws NoConnection, NoValue,OutOfRange;

	public ATime getLocalZoneTime() throws NoConnection, NoValue;

	public MInteger getSatelliteID() throws NoConnection, NoValue;

	public MInteger getSatelliteInView() throws NoConnection, NoValue;

	public MInteger getSatellitesInUse() throws NoConnection, NoValue;

	public MDecimal getSignalSrength() throws NoConnection, NoValue;

	/**
	 * Signal to Noise Ratio - dB (decibels)
	 */
	public MDecimal getSNR() throws NoConnection, NoValue;

	public Knots getSOG() throws NoConnection, NoValue;

	public MDecimal getEPT() throws NoConnection, NoValue, OutOfRange;

	/**
	 * Defining the status of the gps receiver. Ex- connected/trying to connect
	 */
	public MString getStatus() throws NoConnection, NoValue;

	public ATime getTime() throws NoConnection, NoValue;

	/**
	 * Dilution of precision
	 */
	public MDecimal getVDOP() throws NoConnection, NoValue;

	public MDecimal getHDOP() throws NoConnection, NoValue;

	public MDecimal getPDOP() throws NoConnection, NoValue;
	
	@XmlType(name="GpsQuantities")
	public enum GPSQuantity implements IQuantity {
		ALTITUDE, SOG, COG, AZIMUTH, COORDINATE, DATE,
		ELEVATION, LOCAL_ZONE_TIME, SATELLITE_ID, SATELLITE_IN_VIEW,
		SATELLITES_IN_USE, SIGNAL_STRENGTH, SNR, EPT, STATUS, TIME,
		VDOP, HDOP, PDOP;
	}
}
