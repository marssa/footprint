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

import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "MString", factoryClass = TypeFactory.class, factoryMethod = "getMStringInstance")
public class MString {
	// static Logger MString =  LoggerFactory.getLogger("MString");

	@XmlValue
	private String contents;

	public MString() {
	}

	public MString(String contents) {
		this.contents = contents;
	}

	public String getContents() {
		// MString.trace(MMarker.GETTER,"Getting contents \"{}\"",contents);
		return contents;
	}

	public String toString() {
		// MString.trace(MMarker.GETTER,"Getting string as a String \"{}\"",contents);
		return contents;
	}

	public MString toJSON() {
		// MString.debug("JSON annotation ");
		return new MString(new JSONSerializer().deepSerialize(this));
	}
}
