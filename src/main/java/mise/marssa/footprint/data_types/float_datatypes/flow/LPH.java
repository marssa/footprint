/**
 * 
 */
package mise.marssa.footprint.data_types.float_datatypes.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for litres per hour
 */
@XmlType(name = "LPH", factoryClass = TypeFactory.class, factoryMethod = "getLPHInstance")
public class LPH extends AVolumeFlow{

	public LPH(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value;
	}

	@Override
	public float getLPM() {
		return value / 60f;
	}

	@Override
	public float getLPS() {
		return value / 3600f;
	}

	@Override
	public float getMCPS() {
		return value * 0.001f / 3600f;
	}

	@Override
	public float getMCPM() {
		return value * 0.001f / 60f;
	}

	@Override
	public float getMCPH() {
		return value * 0.001f;
	}

	@Override
	public float getCFPS() {
		return value * 0.0000098096295036f;
	}

	@Override
	public float getCFPM() {
		return value * 0.00058857777022f;
	}

	@Override
	public float getCFPH() {
		return value * 0.035314666213f;
	}

	
}
