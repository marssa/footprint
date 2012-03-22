/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

/**
 * @author Alan Grech
 * conversion for: litres per minute
 */
@XmlType(name = "LPM", factoryClass = TypeFactory.class, factoryMethod = "getLPMInstance")
@Entity
public class LPM extends AVolumeFlow{

	private static Logger LPM = (Logger) LoggerFactory.getLogger("LPM");
	public LPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to LPH : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getLPM() {
		LPM.trace(MMarker.GETTER,"Getting LPM: {}",value);
		return value;
	}

	@Override
	public float getLPS() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to LPS : {}",value / 60f);
		return value / 60f;
	}

	@Override
	public float getMCPS() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to MCPS : {}",value * 0.001f / 60f);
		return value * 0.001f / 60f;
	}

	@Override
	public float getMCPM() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to MCPM : {}",value * 0.001f);
		return value * 0.001f;
	}

	@Override
	public float getMCPH() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to MCPH : {}",value * 0.001f * 60f);
		return value * 0.001f * 60f;
	}

	@Override
	public float getCFPS() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to CFPS : {}",value * 0.00058857777022f);
		return value * 0.00058857777022f;
	}

	@Override
	public float getCFPM() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to CFPM : {}",value * 0.035314666213f);
		return value * 0.035314666213f;
	}

	@Override
	public float getCFPH() {
		LPM.trace(MMarker.GETTER,"Converting from LPM to CFPH : {}",value * 2.1188799728f);
		return value * 2.1188799728f;
	}
}
