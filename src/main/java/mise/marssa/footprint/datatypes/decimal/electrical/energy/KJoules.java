/**
 * 
 */
package mise.marssa.footprint.datatypes.decimal.electrical.energy;

import static javax.measure.unit.SI.JOULE;
import static javax.measure.unit.SI.KILO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.TypeFactory;

import org.hibernate.annotations.AccessType;

/**
 * @author Warren Zahra
 *
 */
@XmlType(name = "KJoules", factoryClass = TypeFactory.class, factoryMethod = "getKJoulesInstance")
@Entity
@AccessType("property")
public class KJoules extends AEnergy {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3775759578719733137L;

	public KJoules(double value) {
		super(value, KILO(JOULE));
	}
	
	@Column(name = "KJoules")
	public double getValue(){
		return super.doubleValue();
	}
}
