/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.flow;

import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;

/**
 * @author Alan Grech
 * conversions for: cubic foot per hour
 */
@XmlType(name = "CFPH", factoryClass = TypeFactory.class, factoryMethod = "getCFPHInstance")
public class CFPH extends AVolumeFlow {

	public CFPH(float value) throws OutOfRange {
		super(value);
		}

	@Override
	public float getLPH() {
		return value * 28.316847f;
	}

	@Override
	public float getLPM() {
		return value * 0.47194744999f;
	}

	@Override
	public float getLPS() {
		return value * 0.0078657908333f;
	}

	@Override
	public float getMCPS() {
		return value * 0.0000078657908333f;
	}

	@Override
	public float getMCPM() {
		return value * 0.00047194744999f;
	}

	@Override
	public float getMCPH() {
		return value * 0.028316847f;
	}

	@Override
	public float getCFPS() {
		return value * 0.00027777777778f;
	}

	@Override
	public float getCFPM() {
		return value * 0.016666666667f;
	}

	@Override
	public float getCFPH() {
		return this.value;
	}
}
