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
 * conversions for litres per hour
 */
@XmlType(name = "LPH", factoryClass = TypeFactory.class, factoryMethod = "getLPHInstance")
public class LPH extends AVolumeFlow{

	private static Logger LPH = (Logger) LoggerFactory.getLogger("LPH");
	public LPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		LPH.trace(MMarker.GETTER,"Getting LPH: {}",value);
		return value;
	}

	@Override
	public float getLPM() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to LPM : {}",value / 60f);
		return value / 60f;
	}

	@Override
	public float getLPS() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to LPS : {}",value / 3600f);
		return value / 3600f;
	}

	@Override
	public float getMCPS() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to MCPS : {}",value * 0.001f / 3600f);
		return value * 0.001f / 3600f;
	}

	@Override
	public float getMCPM() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to MCPM : {}",value * 0.001f / 60f);
		return value * 0.001f / 60f;
	}

	@Override
	public float getMCPH() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to MCPH : {}",value * 0.001f);
		return value * 0.001f;
	}

	@Override
	public float getCFPS() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to CFPS : {}",value * 0.0000098096295036f);
		return value * 0.0000098096295036f;
	}

	@Override
	public float getCFPM() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to CFPM : {}",value * 0.00058857777022f);
		return value * 0.00058857777022f;
	}

	@Override
	public float getCFPH() {
		LPH.trace(MMarker.GETTER,"Converting from LPH to CFPH : {}",value * 0.035314666213f);
		return value * 0.035314666213f;
	}

	
}
