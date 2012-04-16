/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

import org.hibernate.annotations.AccessType;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "Joules", factoryClass = TypeFactory.class, factoryMethod = "getJoulesInstance")
@Entity
@AccessType("property")
public class Joules extends AEnergy {

	public Joules(double value) {
		super(value, JOULE);
	}
	
	@Column(name = "Joules")
	public double getValue(){
		return super.doubleValue();
	}
}

