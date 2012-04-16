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
package mise.marssa.footprint.datatypes.integer;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;

import org.hibernate.annotations.GenericGenerator;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MInteger", factoryClass = TypeFactory.class, factoryMethod = "getMIntegerInstance")
@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
public class MInteger extends BigInteger {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 2838329160994833031L;
	
	@SuppressWarnings("unused")
	@XmlValue
	private BigInteger unused;

	private MInteger() {
		super(Integer.toString(0));
	}
	
	public MInteger(int value) {
		super(Integer.toString(value));
	}
	
	public MInteger(long value) {
		super(Long.toString(value));
	}

	public void finalize() throws Throwable {

	}

	// TODO check if JSON serialization still works
//	@JSON
//	public int getValue() {
//		return value;
//	}

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	public Long getId() {
		return id;
	}

	private void setId(Long id) {
		this.id = id;
	}

	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
