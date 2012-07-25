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
package org.marssa.footprint.datatypes.decimal;

import java.math.BigDecimal;
import java.math.MathContext;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.hibernate.annotations.GenericGenerator;
import org.marssa.footprint.datatypes.MString;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MDecimal")
@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
public class MDecimal extends BigDecimal {

	/**
	 * 
	 */
	private static final long serialVersionUID = 241201800992014889L;

	@XmlValue
	private final BigDecimal value;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	private MDecimal() {
		super(0);
		this.value = new BigDecimal(0);
	}

	public MDecimal(double value) {
		super(value);
		this.value = new BigDecimal(value);
	}

	public MDecimal(double value, MathContext mc) {
		super(value, mc);
		this.value = new BigDecimal(value, mc);
	}

	public MDecimal(BigDecimal value) {
		super(value.toString());
		this.value = value;
	}
	
	public MDecimal(BigDecimal value, MathContext mc) {
		super(value.toString(), mc);
		this.value = new BigDecimal(value.toString(), mc);
	}
	
	@Override
	public void finalize() throws Throwable {

	}

	public MString toJSON() {
		return new MString(new JSONSerializer().deepSerialize(this));
	}

	@Override
	public String toString() {
		return value.toPlainString();
	}
}
