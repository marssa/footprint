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
package org.marssa.footprint.datatypes;

import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "MDate", factoryClass = TypeFactory.class, factoryMethod = "getMDateInstance")
public class MDate extends java.util.Date {

	private static Logger MDate = (Logger) LoggerFactory.getLogger("MDate");

	private static final long serialVersionUID = 1L;
	
	@SuppressWarnings("unused")
	@XmlValue
	private java.util.Date unused;

	// TODO See how an XML element can be added for the date
	public MDate(long date) {
		super(date);
		MDate.trace("Passing \"{}l\" to parent class Date", date);
	}

	public MString toJSON() {
		MDate.trace("JSON annotation ");
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}
