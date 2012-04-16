/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;
import static javax.measure.unit.SI.KILO;
import static javax.measure.unit.SI.MILLI;
import static javax.measure.unit.SI.MEGA;

import javax.measure.quantity.ElectricCurrent;
import javax.measure.quantity.Energy;
import javax.measure.unit.Unit;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "AEnergy", factoryClass = TypeFactory.class, factoryMethod = "getACurrentInstance")
public abstract class AEnergy extends MDecimal {


	private static Logger logger = (Logger) LoggerFactory
			.getLogger(AEnergy.class.getName());

	private Unit<Energy> energyUnit;

	protected AEnergy(double value, Unit<Energy> unit) {
		super(value);
		this.energyUnit = unit;
	}

	public MDecimal getJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(JOULE)
				.convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to Amps : {}",
				energyUnit, result);
		return result;
	}

	public MDecimal getKJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(KILO(JOULE)).convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				energyUnit, result);
		return result;
	}
	
	
	
	public MDecimal getMJoules() {
		MDecimal result = new MDecimal(energyUnit.getConverterTo(MEGA(JOULE)).convert(doubleValue()));
		logger.trace(MMarker.GETTER, "Converting from {} to milli Amps : {}",
				energyUnit, result);
		return result;
	}

	
}
