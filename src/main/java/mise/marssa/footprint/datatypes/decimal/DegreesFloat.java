/**
 * Copyright 2012 MARSEC-XL Foundation
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
package mise.marssa.footprint.datatypes.decimal;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.datatypes.TypeFactory;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:24
 */
@XmlType(name = "DegreesFloat", factoryClass = TypeFactory.class, factoryMethod = "getDegreesFloatInstance")
@Entity
public class DegreesFloat extends MFloat {

	public DegreesFloat() {
	}

	public DegreesFloat(float value) {
		super(value);
	}

	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().exclude("value")
				.deepSerialize(this));
		return JSON;
	}

}
