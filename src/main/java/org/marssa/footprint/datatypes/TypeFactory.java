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
/**
 * 
 */
package org.marssa.footprint.datatypes;

import org.marssa.footprint.datatypes.composite.APosition;
import org.marssa.footprint.datatypes.composite.Attitude;
import org.marssa.footprint.datatypes.composite.Coordinate;
import org.marssa.footprint.datatypes.composite.Latitude;
import org.marssa.footprint.datatypes.composite.Longitude;
import org.marssa.footprint.datatypes.composite.Pitch;
import org.marssa.footprint.datatypes.composite.Roll;
import org.marssa.footprint.datatypes.composite.Yaw;
import org.marssa.footprint.datatypes.decimal.DegreesDecimal;
import org.marssa.footprint.datatypes.decimal.MDecimal;
import org.marssa.footprint.datatypes.decimal.UnsignedDecimal;
import org.marssa.footprint.datatypes.decimal.distance.ADistance;
import org.marssa.footprint.datatypes.decimal.distance.Fathoms;
import org.marssa.footprint.datatypes.decimal.distance.KM;
import org.marssa.footprint.datatypes.decimal.distance.Metres;
import org.marssa.footprint.datatypes.decimal.distance.Miles;
import org.marssa.footprint.datatypes.decimal.distance.NM;
import org.marssa.footprint.datatypes.decimal.electrical.charge.ACharge;
import org.marssa.footprint.datatypes.decimal.electrical.charge.Ah;
import org.marssa.footprint.datatypes.decimal.electrical.charge.Coulombs;
import org.marssa.footprint.datatypes.decimal.electrical.charge.mAh;
import org.marssa.footprint.datatypes.decimal.electrical.current.ACurrent;
import org.marssa.footprint.datatypes.decimal.electrical.current.Amps;
import org.marssa.footprint.datatypes.decimal.electrical.current.MilliAmps;
import org.marssa.footprint.datatypes.decimal.electrical.energy.AEnergy;
import org.marssa.footprint.datatypes.decimal.electrical.energy.Joules;
import org.marssa.footprint.datatypes.decimal.electrical.energy.KJoules;
import org.marssa.footprint.datatypes.decimal.electrical.energy.MJoules;
import org.marssa.footprint.datatypes.decimal.electrical.impedance.AImpedance;
import org.marssa.footprint.datatypes.decimal.electrical.impedance.KOhms;
import org.marssa.footprint.datatypes.decimal.electrical.impedance.MOhms;
import org.marssa.footprint.datatypes.decimal.electrical.impedance.Ohms;
import org.marssa.footprint.datatypes.decimal.electrical.power.APower;
import org.marssa.footprint.datatypes.decimal.electrical.power.KWatts;
import org.marssa.footprint.datatypes.decimal.electrical.power.MWatts;
import org.marssa.footprint.datatypes.decimal.electrical.voltage.AVoltage;
import org.marssa.footprint.datatypes.decimal.electrical.voltage.MilliVolts;
import org.marssa.footprint.datatypes.decimal.electrical.voltage.Volts;
import org.marssa.footprint.datatypes.decimal.flow.AVolumeFlow;
import org.marssa.footprint.datatypes.decimal.flow.CFPH;
import org.marssa.footprint.datatypes.decimal.flow.CFPM;
import org.marssa.footprint.datatypes.decimal.flow.CFPS;
import org.marssa.footprint.datatypes.decimal.flow.LPH;
import org.marssa.footprint.datatypes.decimal.flow.LPM;
import org.marssa.footprint.datatypes.decimal.flow.LPS;
import org.marssa.footprint.datatypes.decimal.flow.MCPH;
import org.marssa.footprint.datatypes.decimal.flow.MCPM;
import org.marssa.footprint.datatypes.decimal.flow.MCPS;
import org.marssa.footprint.datatypes.decimal.frequency.AFrequency;
import org.marssa.footprint.datatypes.decimal.frequency.Hz;
import org.marssa.footprint.datatypes.decimal.frequency.KHz;
import org.marssa.footprint.datatypes.decimal.pressure.APressure;
import org.marssa.footprint.datatypes.decimal.pressure.Bar;
import org.marssa.footprint.datatypes.decimal.pressure.KPa;
import org.marssa.footprint.datatypes.decimal.pressure.MBars;
import org.marssa.footprint.datatypes.decimal.pressure.MMHg;
import org.marssa.footprint.datatypes.decimal.pressure.PSI;
import org.marssa.footprint.datatypes.decimal.pressure.Pascals;
import org.marssa.footprint.datatypes.decimal.speed.ASpeed;
import org.marssa.footprint.datatypes.decimal.speed.KPH;
import org.marssa.footprint.datatypes.decimal.speed.Knots;
import org.marssa.footprint.datatypes.decimal.speed.MPH;
import org.marssa.footprint.datatypes.decimal.speed.MPS;
import org.marssa.footprint.datatypes.decimal.temperature.ATemperature;
import org.marssa.footprint.datatypes.decimal.temperature.DegreesCelcius;
import org.marssa.footprint.datatypes.decimal.temperature.Fahrenheit;
import org.marssa.footprint.datatypes.decimal.temperature.Kelvin;
import org.marssa.footprint.datatypes.decimal.volume.AVolume;
import org.marssa.footprint.datatypes.decimal.volume.ImpGallons;
import org.marssa.footprint.datatypes.decimal.volume.Litres;
import org.marssa.footprint.datatypes.decimal.volume.USGallonsDry;
import org.marssa.footprint.datatypes.decimal.volume.USGallonsLiquid;
import org.marssa.footprint.datatypes.integer.DegreesInteger;
import org.marssa.footprint.datatypes.integer.MInteger;
import org.marssa.footprint.datatypes.integer.PercentageInteger;
import org.marssa.footprint.datatypes.time.ATime;
import org.marssa.footprint.datatypes.time.Hours;
import org.marssa.footprint.datatypes.time.Milliseconds;
import org.marssa.footprint.datatypes.time.Minutes;
import org.marssa.footprint.datatypes.time.Seconds;
import org.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Clayton Tabone
 * 
 */
public class TypeFactory {

	public static Hours getHoursInstance() {
		return new Hours(100l);
	}

	public static Minutes getMinutesInstance() {
		return new Minutes(100l);
	}

	public static Seconds getSecondsInstance() {
		return new Seconds(100l);
	}

	public static Milliseconds getMillisecondsInstance() {
		return new Milliseconds(100l);
	}

	public static ATime getATimeInstance() {
		return new Milliseconds(100l);
	}

	// Voltage
	public static AVoltage getAVoltageInstance() {
		return new Volts(100l);
	}

	public static MilliVolts getMilliVoltsInstance() {
		return new MilliVolts(100l);
	}

	/**
	 * Frequency
	 */
	public static AFrequency getAFrequencyInstance() throws OutOfRange {
		return new Hz(100l);
	}

	public static KHz getKHzInstance() throws OutOfRange {
		return new KHz(100l);
	}

	/**
	 * Flow
	 */

	/*
	 * TODO mass flow datatypes public static AMassFlow getAMassFlowInstance()
	 * throws OutOfRange { return new (100l); }
	 */

	public static AVolumeFlow getAVolumeFlowInstance() throws OutOfRange {
		return new CFPH(100l);
	}

	public static CFPH getCFPHInstance() throws OutOfRange {
		return new CFPH(100l);
	}

	public static CFPM getCFPMInstance() throws OutOfRange {
		return new CFPM(100l);
	}

	public static CFPS getCFPSInstance() throws OutOfRange {
		return new CFPS(100l);
	}

	public static LPH getLPHInstance() throws OutOfRange {
		return new LPH(100l);
	}

	public static LPM getLPMInstance() throws OutOfRange {
		return new LPM(100l);
	}

	public static LPS getLPSInstance() throws OutOfRange {
		return new LPS(100l);
	}

	public static MCPH getMCPHInstance() throws OutOfRange {
		return new MCPH(100l);
	}

	public static MCPM getMCPMInstance() throws OutOfRange {
		return new MCPM(100l);
	}

	public static MCPS getMCPSInstance() throws OutOfRange {
		return new MCPS(100l);
	}

	/**
	 * Pressure
	 */
	public static APressure getAPressureInstance() throws OutOfRange {
		return new Bar(100l);
	}

	public static Bar getBarInstance() throws OutOfRange {
		return new Bar(100l);
	}

	public static KPa getKPaInstance() throws OutOfRange {
		return new KPa(100l);
	}

	public static MBars getMBarsInstance() throws OutOfRange {
		return new MBars(100l);
	}

	public static MMHg getMMHgInstance() throws OutOfRange {
		return new MMHg(100l);
	}

	public static Pascals getPascalsInstance() throws OutOfRange {
		return new Pascals(100l);
	}

	public static PSI getPSIInstance() throws OutOfRange {
		return new PSI(100l);
	}

	/**
	 * Speed
	 */
	public static ASpeed getASpeedInstance() throws OutOfRange {
		return new Knots(100l);
	}

	public static Knots getKnotsInstance() throws OutOfRange {
		return new Knots(100l);
	}

	public static KPH getKPHInstance() throws OutOfRange {
		return new KPH(100l);
	}

	public static MPH getMPHInstance() throws OutOfRange {
		return new MPH(100l);
	}

	public static MPS getMPSInstance() throws OutOfRange {
		return new MPS(100l);
	}

	/**
	 * Temperature
	 */
	public static ATemperature getATemperatureInstance() throws OutOfRange {
		return new DegreesCelcius(100l);
	}

	public static Fahrenheit getFahrenheitInstance() throws OutOfRange {
		return new Fahrenheit(100l);
	}

	public static Kelvin getKelvinInstance() throws OutOfRange {
		return new Kelvin(100l);
	}

	/**
	 * Volume
	 */
	public static AVolume getAVolumeInstance() throws OutOfRange {
		return new Litres(100l);
	}

	public static USGallonsLiquid getUSGallonsLiquidInstance()
			throws OutOfRange {
		return new USGallonsLiquid(100l);
	}

	public static USGallonsDry getUSGallonsDryInstance() throws OutOfRange {
		return new USGallonsDry(100l);
	}

	public static ImpGallons getImpGallonsInstance() throws OutOfRange {
		return new ImpGallons(100l);
	}

	public static Litres getLitresInstance() throws OutOfRange {
		return new Litres(100l);
	}

	/**
	 * Native DataTypes
	 */

	public static MBoolean getMBooleanInstance() throws OutOfRange {
		return new MBoolean(true);
	}

	public static MDate getMDateInstance() throws OutOfRange {
		return new MDate(100l);
	}

	public static MString getMStringInstance() throws OutOfRange {
		return new MString("");
	}

	/**
	 * Composite DataTypes
	 */

	public static APosition getAPositionInstance() throws OutOfRange {
		return new Latitude(getDegreesDecimalInstance());
	}

	public static Attitude getAttitudeInstance() throws OutOfRange {
		return new Attitude(getPitchInstance(), getRollInstance(),
				getYawInstance());
	}

	public static Coordinate getCoordinateInstance() throws OutOfRange {
		return new Coordinate(getLatitudeInstance(), getLongitudeInstance());
	}

	public static Latitude getLatitudeInstance() throws OutOfRange {
		return new Latitude(getDegreesDecimalInstance());
	}

	public static Longitude getLongitudeInstance() throws OutOfRange {
		return new Longitude(getDegreesDecimalInstance());
	}

	public static Pitch getPitchInstance() throws OutOfRange {
		return new Pitch(getDegreesDecimalInstance());
	}

	public static Roll getRollInstance() throws OutOfRange {
		return new Roll(getDegreesDecimalInstance());
	}

	public static Yaw getYawInstance() throws OutOfRange {
		return new Yaw(getDegreesDecimalInstance());
	}

	/**
	 * DataTypes
	 */

	public static DegreesDecimal getDegreesDecimalInstance() throws OutOfRange {
		return new DegreesDecimal(0);
	}

	public static MDecimal getMDecimalInstance() throws OutOfRange {
		return new MDecimal(0);
	}

	public static UnsignedDecimal getUnsignedDecimalInstance()
			throws OutOfRange {
		return new UnsignedDecimal(0);
	}

	/**
	 * Distance
	 */

	public static ADistance getADistanceInstance() throws OutOfRange {
		return new NM(0);
	}

	public static Fathoms getFathomsInstance() throws OutOfRange {
		return new Fathoms(0);
	}

	public static KM getKMInstance() throws OutOfRange {
		return new KM(0);
	}

	public static Metres getMetresInstance() throws OutOfRange {
		return new Metres(0);
	}

	public static Miles getMilesInstance() throws OutOfRange {
		return new Miles(0);
	}

	public static NM getNmInstance() throws OutOfRange {
		return new NM(0);
	}

	/**
	 * Electrical Charge
	 */

	public static ACharge getAChargeInstance() throws OutOfRange {
		return new Ah(0);
	}

	public static Coulombs getCoulombsInstance() throws OutOfRange {
		return new Coulombs(0);
	}

	public static mAh getmAhInstance() throws OutOfRange {
		return new mAh(0);
	}

	/**
	 * Electrical Current
	 */

	public static ACurrent getACurrentInstance() throws OutOfRange {
		return new Amps(0);
	}

	public static MilliAmps getMilliAmpsInstance() throws OutOfRange {
		return new MilliAmps(0);
	}

	/**
	 * Impedance
	 */

	public static AImpedance getAImpedanceInstance() throws OutOfRange {
		return new Ohms(0);
	}

	public static KOhms getKOhmsInstance() throws OutOfRange {
		return new KOhms(0);
	}

	public static MOhms getMOhmsInstance() throws OutOfRange {
		return new MOhms(0);
	}

	/**
	 * Power
	 */

	public static APower getAPowerInstance() throws OutOfRange {
		return new KWatts(0);
	}

	public static MWatts getMWattsInstance() throws OutOfRange {
		return new MWatts(0);
	}

	/**
	 * Integer DataTypes
	 */

	public static DegreesInteger getDegreesIntegerInstance() throws OutOfRange {
		return new DegreesInteger(0);
	}

	public static MInteger getMIntegerInstance() throws OutOfRange {
		return new MInteger(0);
	}

	public static PercentageInteger getPercentageIntegerInstance()
			throws OutOfRange {
		return new PercentageInteger(0);
	}

	/**
	 * Electrical Energy DataTypes
	 */

	public static AEnergy getAEnergyInstance() throws OutOfRange {
		return new Joules(0);
	}

	public static KJoules getKJoulesInstance() throws OutOfRange {
		return new KJoules(0);
	}

	public static MJoules getMJoulesInstance() throws OutOfRange {
		return new MJoules(0);
	}

}
