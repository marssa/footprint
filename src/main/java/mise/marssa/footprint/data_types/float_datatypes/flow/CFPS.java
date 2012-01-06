/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per second
 */
@XmlType(name = "CFPS", factoryClass = TypeFactory.class, factoryMethod = "getCFPSInstance")
public class CFPS extends AVolumeFlow{

	public CFPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 101940.6492f;
	}

	@Override
	public float getLPM() {
		return value * 1699.01082f;
	}

	@Override
	public float getLPS() {
		return value * 28.316847f;
	}

	@Override
	public float getMCPS() {
		return value * 0.028316847f;
	}

	@Override
	public float getMCPM() {
		return value * 1.69901082f;
	}

	@Override
	public float getMCPH() {
		return value * 101.9406492f;
	}

	@Override
	public float getCFPS() {
		return value;
	}

	@Override
	public float getCFPM() {
		return value * 60f;
	}

	@Override
	public float getCFPH() {
		return value * 3600f;
	}
}
