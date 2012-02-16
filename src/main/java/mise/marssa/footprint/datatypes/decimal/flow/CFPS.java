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
 * conversions for: cubic foot per second
 */
@XmlType(name = "CFPS", factoryClass = TypeFactory.class, factoryMethod = "getCFPSInstance")
public class CFPS extends AVolumeFlow{

	private static Logger CFPS = (Logger) LoggerFactory.getLogger("CFPS");
	public CFPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to LPH : {}",value * 101940.6492f);
		return value * 101940.6492f;
	}

	@Override
	public float getLPM() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to LPM : {}",value * 1699.01082f);
		return value * 1699.01082f;
	}

	@Override
	public float getLPS() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to LPS : {}",value * 28.316847f);
		return value * 28.316847f;
	}

	@Override
	public float getMCPS() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to MCPS : {}",value * 0.028316847f);
		return value * 0.028316847f;
	}

	@Override
	public float getMCPM() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to MCPM : {}",value * 1.69901082f);
		return value * 1.69901082f;
	}

	@Override
	public float getMCPH() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to MCPH : {}",value * 101.9406492f);
		return value * 101.9406492f;
	}

	@Override
	public float getCFPS() {
		CFPS.trace(MMarker.GETTER,"Getting CFPS: {}",value);
		return value;
	}

	@Override
	public float getCFPM() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to CFPM : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getCFPH() {
		CFPS.trace(MMarker.GETTER,"Converting from CFPS to CFPH : {}",value * 3600f);
		return value * 3600f;
	}
}
