package mise.marssa.interfaces.navigation_equipment;

import mise.marssa.data_types.Date;
import mise.marssa.data_types.Time;
import mise.marssa.data_types.composite_datatypes.Coordinate;
import mise.marssa.data_types.float_datatypes.DegreesFloat;
import mise.marssa.data_types.float_datatypes.speed.Knots;
import mise.marssa.data_types.integer_datatypes.DegreesInteger;
import mise.marssa.data_types.integer_datatypes.Integer;
import mise.marssa.data_types.String;
import mise.marssa.exceptions.NoConnection;
import mise.marssa.exceptions.NoValue;

/**
 * @author Alan
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
public interface IGpsReceiver {

	public DegreesInteger getAzimuth();

	/**
	 * Course Over Ground
	 * @throws NoConnection 
	 * @throws NoValue 
	 */
	public DegreesFloat getCOG() throws NoConnection, NoValue;

	public Coordinate getCoordinate() throws NoConnection, NoValue;

	public Date getDate() throws NoConnection, NoValue;

	public DegreesInteger getElevation() throws NoConnection, NoValue;

	public Float getHDOP() throws NoConnection, NoValue;

	public Time getLocalZoneTime() throws NoConnection, NoValue;

	public Float getPDOP() throws NoConnection, NoValue;

	public Integer getSatelliteID() throws NoConnection, NoValue;

	public Integer getSatelliteInView() throws NoConnection, NoValue;

	public Integer getSatellitesInUse() throws NoConnection, NoValue;

	public Float getSignalSrength() throws NoConnection, NoValue;

	/**
	 * Signal to Noise Ratio - dB (decibels)
	 */
	public Float getSNR() throws NoConnection, NoValue;

	public Knots getSOG() throws NoConnection, NoValue;

	/**
	 * Defining the status of the gps receiver. Ex- connected/trying to connect
	 */
	public String getStatus() throws NoConnection, NoValue;

	public Time getTime() throws NoConnection, NoValue;

	public Float getVDOP() throws NoConnection, NoValue;
}