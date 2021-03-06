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
package org.marssa.footprint.datatypes.time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


import org.hibernate.annotations.GenericGenerator;
import org.marssa.footprint.datatypes.MString;
import org.marssa.footprint.datatypes.TypeFactory;

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "ATime", factoryClass = TypeFactory.class, factoryMethod = "getATimeInstance")
@Entity
@Inheritance(strategy = javax.persistence.InheritanceType.TABLE_PER_CLASS)
public abstract class ATime {

	@XmlElement
	protected long time;

	@Id
	@Column(name = "id")
	@GeneratedValue(generator = "increment")
	@GenericGenerator(name = "increment", strategy = "increment")
	Long id;

	protected ATime() {
	}

	public ATime(long time) {
		this.time = time;
	}

	abstract public long getMilliseconds();

	abstract public long getSeconds();

	abstract public long getMinutes();

	abstract public long getHour();

	@Override
	public java.lang.String toString() {
		return "HHMMSSS: " + (int) Math.floor(getHour()) + ":"
				+ (int) Math.floor(getMinutes()) % 60 + ":" + getSeconds() % 60;
	}

	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().deepSerialize(this));
		return JSON;
	}
}
