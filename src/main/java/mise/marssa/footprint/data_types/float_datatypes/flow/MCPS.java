package mise.marssa.footprint.data_types.float_datatypes.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversion for: mcubic meters per second
 */
@XmlType(name = "MCPS", factoryClass = TypeFactory.class, factoryMethod = "getMCPSInstance")
public class MCPS extends AVolumeFlow {

	public MCPS(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getLPH() {
		return value * 1000f * 3600f;
	}

	@Override
	public float getLPM() {
		return value * 1000f * 60f;
	}

	@Override
	public float getLPS() {
		return value * 1000f;
	}

	@Override
	public float getMCPS() {
		return value;
	}

	@Override
	public float getMCPM() {
		return value * 60f;
	}

	@Override
	public float getMCPH() {
		return value * 3600f;
	}

	@Override
	public float getCFPS(){ 
		return value *  35.314666213f;
	}

	@Override
	public float getCFPM() {
		return value * 2118.8799728f;
	}

	@Override
	public float getCFPH() {
		return value * 127132.79837f;
	}

}
