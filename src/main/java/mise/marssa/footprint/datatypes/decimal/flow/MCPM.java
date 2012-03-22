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
 * cubic meters per minute
 */
@XmlType(name = "MCPM", factoryClass = TypeFactory.class, factoryMethod = "getMCPMInstance")
@Entity
public class MCPM extends AVolumeFlow {

	private static Logger MCPM = (Logger) LoggerFactory.getLogger("MCPM");
	public MCPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f* 60f);
		return value * 1000f * 60f;
	}

	@Override
	public float getLPM() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f);
		return value * 1000f;
	}

	@Override
	public float getLPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 1000f/ 60f);
		return value * 1000f / 60f;
	}

	@Override
	public float getMCPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value / 60f);
		return value / 60f;
	}

	@Override
	public float getMCPM() {
		MCPM.trace(MMarker.GETTER,"Getting MCPM: {}",value);
		return value;
	}

	@Override
	public float getMCPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 60f);
		return value * 60f;
	}

	@Override
	public float getCFPS() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 0.58857777022f);
		return value * 0.58857777022f;
	}

	@Override
	public float getCFPM() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 35.314666213f);
		return value * 35.314666213f;
	}

	@Override
	public float getCFPH() {
		MCPM.trace(MMarker.GETTER,"Converting from MCPM to LPH : {}",value * 2118.8799728f);
		return value * 2118.8799728f;
	}
}
