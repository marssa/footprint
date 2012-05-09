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
package mise.marssa.footprint.datatypes.decimal;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import mise.marssa.footprint.datatypes.MString;
import mise.marssa.footprint.exceptions.OutOfRange;
import mise.marssa.footprint.logger.MMarker;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import flexjson.JSONSerializer;

/**
 * @author Alan Grech
 * @version 1.0
 * @created 08-Jul-2011 09:53:29
 */
@XmlType(name = "PercentageFloat")
@Entity
public class PercentageFloat extends MDecimal {
	/**
	 * 
	 */
	private static final long serialVersionUID = 5638098133108829681L;
	private static Logger PercentageFloat = (Logger) LoggerFactory
			.getLogger("PercentageFloat");

	private PercentageFloat() {
		super(0.0);
	}

	public PercentageFloat(float value) throws OutOfRange {
		super(value);
		if ((value < -100f) || (value > 100f))
			PercentageFloat.debug(MMarker.EXCEPTION,
					"Value received is out of range", new OutOfRange());
	}

	public MString toJSON() {
		MString JSON = new MString(new JSONSerializer().exclude("value")
				.deepSerialize(this));
		return JSON;
	}
}
