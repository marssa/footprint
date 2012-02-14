/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * cubic meters per minute
 */
@XmlType(name = "MCPM", factoryClass = TypeFactory.class, factoryMethod = "getMCPMInstance")
public class MCPM extends AVolumeFlow {

	public MCPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 1000f * 60f;
	}

	@Override
	public float getLPM() {
		return value * 1000f;
	}

	@Override
	public float getLPS() {
		return value * 1000f / 60f;
	}

	@Override
	public float getMCPS() {
		return value / 60f;
	}

	@Override
	public float getMCPM() {
		return value;
	}

	@Override
	public float getMCPH() {
		return value * 60f;
	}

	@Override
	public float getCFPS() {
		return value * 0.58857777022f;
	}

	@Override
	public float getCFPM() {
		return value * 35.314666213f;
	}

	@Override
	public float getCFPH() {
		return value * 2118.8799728f;
	}
}
