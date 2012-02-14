package mise.marssa.footprint.interfaces.navigation;

import mise.marssa.footprint.datatypes.MDate;
import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.composite.Coordinate;
import mise.marssa.footprint.datatypes.decimal.DegreesFloat;
import mise.marssa.footprint.datatypes.decimal.MFloat;
import mise.marssa.footprint.datatypes.decimal.speed.Knots;
import mise.marssa.footprint.datatypes.integer.DegreesInteger;
import mise.marssa.footprint.datatypes.integer.MInteger;
import mise.marssa.footprint.datatypes.time.ATime;
import mise.marssa.footprint.exceptions.NoConnection;
import mise.marssa.footprint.exceptions.NoValue;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
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

	public Coordinate getCoordinate() throws NoConnection, NoValue, OutOfRange;

	public MDate getDate() throws NoConnection, NoValue;

	public DegreesFloat getElevation() throws NoConnection, NoValue;

	public ATime getLocalZoneTime() throws NoConnection, NoValue;

	public MInteger getSatelliteID() throws NoConnection, NoValue;

	public MInteger getSatelliteInView() throws NoConnection, NoValue;

	public MInteger getSatellitesInUse() throws NoConnection, NoValue;

	public MFloat getSignalSrength() throws NoConnection, NoValue;

	/**
	 * Signal to Noise Ratio - dB (decibels)
	 */
	public MFloat getSNR() throws NoConnection, NoValue;

	public Knots getSOG() throws NoConnection, NoValue;
	
	public MFloat getEPT() throws NoConnection, NoValue, OutOfRange;   

	/**
	 * Defining the status of the gps receiver. Ex- connected/trying to connect
	 */
	public MString getStatus() throws NoConnection, NoValue;

	public ATime getTime() throws NoConnection, NoValue;
	
	/**
	 *Dilution of precision 
	 */
	public MFloat getVDOP() throws NoConnection, NoValue;
	public MFloat getHDOP() throws NoConnection, NoValue;
	public MFloat getPDOP() throws NoConnection, NoValue;
}