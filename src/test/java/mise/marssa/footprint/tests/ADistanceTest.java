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
package mise.marssa.footprint.tests;

import static org.junit.Assert.assertEquals;
import mise.marssa.footprint.datatypes.decimal.MDecimal;
import mise.marssa.footprint.datatypes.decimal.distance.Fathoms;
import mise.marssa.footprint.datatypes.decimal.distance.KM;
import mise.marssa.footprint.datatypes.decimal.distance.Metres;
import mise.marssa.footprint.datatypes.decimal.distance.Miles;
import mise.marssa.footprint.datatypes.decimal.distance.NM;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Clayton Tabone
 * 
 */
public class ADistanceTest {

	Fathoms fathoms;
	KM km;
	Metres metres;
	Miles miles;
	NM nm;

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		fathoms = new Fathoms(25.9);
		km = new KM(1.5);
		metres = new Metres(110.0);
		miles = new Miles(28000.0);
		nm = new NM(800.9);
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for
	 * {@link mise.marssa.footprint.datatypes.decimal.distance.ADistance#getKM()}
	 * .
	 */
	@Test
	public void testGetKM() {
		assertEquals(new MDecimal(0.04736592), fathoms.getKM());
		assertEquals(new MDecimal(1.5), km.getKM());
		assertEquals(new MDecimal(0.11), metres.getKM());
		assertEquals(new MDecimal(45061.632), miles.getKM());
		assertEquals(new MDecimal(1483.2668), nm.getKM());
	}

	/**
	 * Test method for
	 * {@link mise.marssa.footprint.datatypes.decimal.distance.ADistance#getMetres()}
	 * .
	 */
	@Test
	public void testGetMetres() {
		assertEquals(new MDecimal(47.365919999999996), fathoms.getMetres());
		assertEquals(new MDecimal(1500), km.getMetres());
		assertEquals(new MDecimal(110.0), metres.getMetres());
		assertEquals(new MDecimal(45061632.0), miles.getMetres());
		assertEquals(new MDecimal(1483266.8), nm.getMetres());
	}

	/**
	 * Test method for
	 * {@link mise.marssa.footprint.datatypes.decimal.distance.ADistance#getMiles()}
	 * .
	 */
	@Test
	public void testGetMiles() {
		assertEquals(0.0294318182, fathoms.getMiles().doubleValue(),
				0.0000000001);
		assertEquals(0.932056788, km.getMiles().doubleValue(), 0.000000001);
		assertEquals(0.0683508311, metres.getMiles().doubleValue(),
				0.0000000001);
		assertEquals(new MDecimal(28000.0), miles.getMiles());
		assertEquals(921.65926, nm.getMiles().doubleValue(), 0.00001);
	}

	/**
	 * Test method for
	 * {@link mise.marssa.footprint.datatypes.decimal.distance.ADistance#getNM()}
	 * .
	 */
	@Test
	public void testGetNM() {
		assertEquals(0.0255755508, fathoms.getNM().doubleValue(), 0.0000000001);
		assertEquals(0.809935205, km.getNM().doubleValue(), 0.000000001);
		assertEquals(0.0593952484, metres.getNM().doubleValue(), 0.0000000001);
		assertEquals(24331.3348, miles.getNM().doubleValue(), 0.0001);
		assertEquals(new MDecimal(800.9), nm.getNM());
	}

	/**
	 * Test method for
	 * {@link mise.marssa.footprint.datatypes.decimal.distance.ADistance#getFathoms()}
	 * .
	 */
	@Test
	public void testGetFathoms() {
		assertEquals(new MDecimal(25.9), fathoms.getFathoms());
		assertEquals(820.209974, km.getFathoms().doubleValue(), 0.000001);
		assertEquals(60.1487314, metres.getFathoms().doubleValue(), 0.0000001);
		assertEquals(new MDecimal(24640000.0), miles.getFathoms());
		assertEquals(811060.149, nm.getFathoms().doubleValue(), 0.001);
	}

}
