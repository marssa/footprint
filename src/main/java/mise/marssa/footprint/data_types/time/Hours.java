/**
 * 
 */
package mise.marssa.footprint.data_types.time;

<<<<<<< HEAD
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
=======
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.data_types.TypeFactory;



>>>>>>> e6793184edce20f79824528fc623171fa3c16425
/**
 * @author Alan Grech
 * 
 */
@XmlType(name = "Hours", factoryClass = TypeFactory.class, factoryMethod = "getHoursInstance")
public class Hours extends ATime {

	public Hours(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		return time * 60 * 60 * 1000;
	}
	@XmlElement(required = true)
	@Override
	public long getSeconds() {
		return time * 60 * 60;
	}

	@Override
	public long getMinutes() {
		return time * 60;
	}

	@Override
	public long getHour() {
		return time;
	}
}
