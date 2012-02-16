package mise.marssa.footprint.datatypes.decimal.pressure;

import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;


@XmlType(name = "PSI", factoryClass = TypeFactory.class, factoryMethod = "getPSIInstance")
public class PSI extends APressure {

	private static Logger PSI = (Logger) LoggerFactory.getLogger("PSI");

	public PSI(float value) throws OutOfRange {
		super(value);
	}

	@Override
	public float getBars() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to Bars : {}",value * 0.0689475f);
		return value * 0.0689475f;
	}

	@Override
	public float getMBars() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to MBars : {}",value *68.9475f);
		return value * 68.9475f;
	}

	@Override
	public float getPa() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to Pascals : {}",value * 6894.75f);
		return value * 6894.75f;
	}

	@Override
	public float getKPa() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to KPa : {}",value * 6.89475f);
		return value * 6.89475f;
	}

	@Override
	public float getMMHg() {
		PSI.trace(MMarker.GETTER,"Converting from PSI to MMHg : {}",value * 51.71487786825f);
		return value * 51.71487786825f;
	}

	@Override
	public float getPSI() {
		PSI.trace(MMarker.GETTER,"Getting PSI: {}",value);
		return value;
	}
}
