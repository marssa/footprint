/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import mise.marssa.footprint.datatypes.decimal.MFloat;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Warren Zahra
 *
 */
@Entity
public class MTimeStamp{


	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TimeStamp")
	private Date timeStamp = new Date(System.currentTimeMillis());
	
	public Date getTimestamp(){
		return timeStamp;
	}
	
	public void setTimestamp(Date timeStamp){
		this.timeStamp = timeStamp;
	}
	
	@Id
	@Column(name = "id")	
	@GeneratedValue(generator="increment")
	@GenericGenerator(name="increment", strategy = "increment")
	Long id;

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}
	
}
