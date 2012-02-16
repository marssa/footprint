/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * conversions for cubic meters per hour
 */
@XmlType(name = "MCPH", factoryClass = TypeFactory.class, factoryMethod = "getMCPHInstance")
public class MCPH extends AVolumeFlow {

	private static Logger MCPH = (Logger) LoggerFactory.getLogger("MCPH");
	public MCPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to LPH : {}",value * 1000f);
		return value * 1000f;
	}

	@Override
	public float getLPM() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to LPM : {}",value * 1000f /60f);
		return value * 1000f /60f;
	}

	@Override
	public float getLPS() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to LPS : {}",value * 1000f / 3600f);
		return value * 1000f / 3600f;
	}

	@Override
	public float getMCPS() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to MCPS : {}",value / 3600f);
		return value / 3600f;
	}

	@Override
	public float getMCPM() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to MCPM : {}",value / 60f);
		return value / 60f;
	}

	@Override
	public float getMCPH() {
		MCPH.trace(MMarker.GETTER,"Getting MCPH: {}",value);
		return value;
	}

	@Override
	public float getCFPS() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to CFPS : {}",value * 0.0098096295036f);
		return value * 0.0098096295036f;
	}

	@Override
	public float getCFPM() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to CFPM : {}",value * 0.58857777022f);
		return value * 0.58857777022f;
	}

	@Override
	public float getCFPH() {
		MCPH.trace(MMarker.GETTER,"Converting from MCPH to CFPH : {}",value * 35.314666213f);
		return value * 35.314666213f;
	}
}
