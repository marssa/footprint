/**
 * Copyright 2012 MARSEC-XL International Limited
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * 
 */
package mise.marssa.footprint.datatypes.time;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.GenericGenerator;

/**
 * @author Warren Zahra
 * 
 */
@Entity(name="TimeLog")
public class MTimeStamp {

	private Date timeStamp = new Date(System.currentTimeMillis());

	public MTimeStamp() {
	}

	public MTimeStamp(Date timestamp) {

		this.timeStamp = timestamp;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "TimeStamp")
	public Date getTimestamp() {
		return timeStamp;
	}

	public void setTimestamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}

	Long id;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

}
