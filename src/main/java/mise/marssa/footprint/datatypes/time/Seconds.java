/*******************************************************************************
 * Copyright 2012 Marsec-XL Foundation
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package mise.marssa.footprint.datatypes.time;

import javax.persistence.Entity;
import javax.xml.bind.annotation.XmlType;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;

import mise.marssa.footprint.datatypes.TypeFactory;
import mise.marssa.footprint.logger.MMarker;



/**
 * @author Alan Grech
 *
 */
@XmlType(name = "Seconds", factoryClass = TypeFactory.class, factoryMethod = "getSecondsInstance")
@Entity
public class Seconds extends ATime {
	
	private static Logger Seconds = (Logger) LoggerFactory.getLogger("Seconds");
	public Seconds(long time) {
		super(time);
	}

	@Override
	public long getMilliseconds() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time * 1000);
		return time * 1000;
	}

	@Override
	public long getSeconds() {
		Seconds.trace(MMarker.GETTER,"Getting Seconds: {}",time);
		return time;
	}

	@Override
	public long getMinutes() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time / 60 );		
		return time / 60;
	}

	@Override
	public long getHour() {
		Seconds.trace(MMarker.GETTER,"Converting from Seconds to MilliSeconds : {}",time / (60* 60) );
		return time / (60* 60);
	}
}
