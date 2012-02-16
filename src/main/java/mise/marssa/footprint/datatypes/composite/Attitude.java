package mise.marssa.footprint.datatypes.composite;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:23
 */
@XmlType(name = "Attitude", factoryClass = TypeFactory.class, factoryMethod = "getAttitudeInstance")

public class Attitude {
	private static Logger Attitude = (Logger) LoggerFactory.getLogger("Attitude");
	private Pitch pitch;
	private Roll roll;
	private Yaw yaw;

	public Attitude(Pitch pitch, Roll roll, Yaw yaw) {
		this.pitch = pitch;
		this.roll = roll;
		this.yaw = yaw;
		Object[] attitude = {pitch.getPitch(),roll.getRoll(),yaw.getYaw()};
		Attitude.trace(MMarker.CONSTRUCTOR,"Constructor created with  Pitch:\"{}\", Roll:\"{}\", Yaw:\"{}\".", attitude);
	}

	public void finalize() throws Throwable {

	}
	@XmlElement
	public Pitch getPitch() {
		Attitude.trace(MMarker.GETTER,"Getting Pitch: {}.",pitch.getPitch());
		return pitch;
	}
	@XmlElement
	public Roll getRoll() {
		Attitude.trace(MMarker.GETTER,"Getting Roll: {}.",roll.getRoll());
		return roll;
	}
	@XmlElement
	public Yaw getYaw() {
		Attitude.trace(MMarker.GETTER,"Getting Yaw: {}.",yaw.getYaw());
		return yaw;
	}

	public java.lang.String toString() {
		Attitude.trace(MMarker.GETTER,"Getting attitude as a String.");
		return "[" + pitch.toString() + ", " + roll.toString() + ", "
				+ yaw.toString() + "]";
	}
	
	public MString toJSON(){
		return new MString(new JSONSerializer().deepSerialize(this));
		 
	}
}