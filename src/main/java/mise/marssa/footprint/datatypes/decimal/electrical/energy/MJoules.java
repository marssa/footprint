/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;
import static javax.measure.unit.SI.MEGA;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

import org.hibernate.annotations.AccessType;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "MJoules", factoryClass = TypeFactory.class, factoryMethod = "getMJoulesInstance")
@Entity
@AccessType("property")
public class MJoules extends AEnergy {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6549821865763682896L;

	public MJoules(double value) {
		super(value, MEGA(JOULE));
	}
	
	@Column(name = "MJoules")
	public double getValue(){
		return super.doubleValue();
	}
}
