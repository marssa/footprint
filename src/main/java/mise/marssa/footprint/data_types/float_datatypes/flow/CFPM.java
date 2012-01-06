/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per minute
 */
@XmlType(name = "CFPM", factoryClass = TypeFactory.class, factoryMethod = "getCFPMInstance")
public class CFPM extends AVolumeFlow {

	public CFPM(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 1699.01082f;
	}

	@Override
	public float getLPM() {
		return value * 28.316846999f;
	}

	@Override
	public float getLPS() {
		return value * 0.47194745f;
	}

	@Override
	public float getMCPS() {
		return value * 0.00047194745f;
	}

	@Override
	public float getMCPM() {
		return value * 0.02831684699f;
	}

	@Override
	public float getMCPH() {
		return value * 1.69901082f;
	}

	@Override
	public float getCFPS() {
		return value * 0.016666666667f;
	}

	@Override
	public float getCFPM() {
		return value;
	}

	@Override
	public float getCFPH() {
		return value * 60f;
	}
}
