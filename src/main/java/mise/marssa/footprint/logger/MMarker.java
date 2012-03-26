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
/**
 * 
 */
package mise.marssa.footprint.logger;

import org.slf4j.Marker;
import org.slf4j.MarkerFactory;

/**
 * @author Warren Zahra
 *
 */
public final class MMarker {
	
	public final static Marker FATAL = MarkerFactory.getMarker("FATAL");
	public final static Marker ALARM = MarkerFactory.getMarker("ALARM");
	public final static Marker GETTER = MarkerFactory.getMarker("GETTER");
	public final static Marker SETTER = MarkerFactory.getMarker("SET");
	public final static Marker CONNECTION = MarkerFactory.getMarker("CONNECTION");
	public final static Marker CONSTRUCTOR = MarkerFactory.getMarker("CONSTRUCTOR");
	public final static Marker JSONSERIALIZATION = MarkerFactory.getMarker("JSONSERIALIZATION");
	public final static Marker EXCEPTION = MarkerFactory.getMarker("EXCEPTION");

}
