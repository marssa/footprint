package mise.marssa.footprint.datatypes.decimal.flow;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * conversion for: litres per second
 */

@XmlType(name = "LPS", factoryClass = TypeFactory.class, factoryMethod = "getLPSInstance")
public class LPS extends AVolumeFlow {

	private static Logger LPS = (Logger) LoggerFactory.getLogger("LPS");
	public LPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to LPH : {}",value * 3600f);
		return value * 3600f;
	}

	@Override
	public float getLPM() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to LPM : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getLPS() {
		LPS.trace(MMarker.GETTER,"Getting LPS: {}",value);
		return value;
	}

	@Override
	public float getMCPS() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to MCPS : {}",value * 0.001f);
		return value * 0.001f;
	}

	@Override
	public float getMCPM() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to MCPM : {}",value * 0.001f * 60f);
		return value * 0.001f * 60f;
	}

	@Override	
	public float getMCPH() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to MCPH : {}",value * 0.001f * 3600f);
		return value * 0.001f * 3600f;
	}

	@Override
	public float getCFPS() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to CFPS : {}",value * 0.035314666213f);
		return value * 0.035314666213f;
	}

	@Override
	public float getCFPM() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to CFPM : {}",value * 2.1188799728f);
		return value * 2.1188799728f;
	}

	@Override
	public float getCFPH() {
		LPS.trace(MMarker.GETTER,"Converting from LPS to CFPH : {}",value * 127.13279837f);
		return value * 127.13279837f;
	}

}
