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
 * conversions for: cubic foot per hour
 */
@XmlType(name = "CFPH", factoryClass = TypeFactory.class, factoryMethod = "getCFPHInstance")
public class CFPH extends AVolumeFlow {

	private static Logger CFPH = (Logger) LoggerFactory.getLogger("CFPH");
	public CFPH(float value) throws OutOfRange {
		super(value);
		}

	@Override
	public float getLPH() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to LPH : {}",value * 28.316847f);
		return value * 28.316847f;
	}

	@Override
	public float getLPM() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to LPM : {}",value * 0.47194744999f);
		return value * 0.47194744999f;
	}

	@Override
	public float getLPS() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to LPS : {}",value * 0.0078657908333f);
		return value * 0.0078657908333f;
	}

	@Override
	public float getMCPS() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to MCPS : {}",value * 0.0000078657908333f);
		return value * 0.0000078657908333f;
	}

	@Override
	public float getMCPM() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to MCPM : {}",value * 0.00047194744999f);
		return value * 0.00047194744999f;
	}

	@Override
	public float getMCPH() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to MCPH : {}",value * 0.028316847f);
		return value * 0.028316847f;
	}

	@Override
	public float getCFPS() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to CFPS : {}",value * 0.00027777777778f);
		return value * 0.00027777777778f;
	}

	@Override
	public float getCFPM() {
		CFPH.trace(MMarker.GETTER,"Converting from CFPH to CFPM : {}",value * 0.016666666667f);
		return value * 0.016666666667f;
	}

	@Override
	public float getCFPH() {
		CFPH.trace(MMarker.GETTER,"Getting CFPH: {}",value);
		return this.value;
	}
}
