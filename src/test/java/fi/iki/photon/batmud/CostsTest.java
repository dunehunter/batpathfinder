package fi.iki.photon.batmud;

import static org.junit.Assert.*;

import org.junit.Test;

import java.io.IOException;

public class CostsTest {

	@Test
	public void testCosts() {
		int ex;
		ex = 0;
		try {
			Costs c = new Costs(null, null);
		} catch (IOException e) {
			ex = 1;
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs", null);
		} catch (IOException e) {
			ex = 1;
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs(null, "src/test/testdata/costs.ship");
		} catch (IOException e) {
			ex = 1;
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs-doesntexist", "src/test/testdata/costs.ship");
			ex = 1;
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Missing src/test/testdata/costs-doesntexist")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs", "src/test/testdata/costs.ship-doesntexist");
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Missing src/test/testdata/costs.ship-doesntexist")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs.badlyformed", "src/test/testdata/costs.ship");
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/costs.badlyformed")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs", "src/test/testdata/costs.ship.badlyformed");
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/costs.ship.badlyformed")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs", "src/test/testdata/costs.ship.badlyformed2");
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/costs.ship.badlyformed2")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Costs c = new Costs("src/test/testdata/costs", "src/test/testdata/costs.ship.badlyformed3");
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/costs.ship.badlyformed3")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		try {
			Costs c = new Costs("src/test/testdata/costs", "src/test/testdata/costs.ship");
			assertEquals(c.getMinLift('h'), 28);
			assertEquals(c.getMaxLift('h'), 42);
//			assertEquals(c.getMinLift('�'), 10000);
			assertEquals(c.getMaxLift('('), 10000);
			
			assertEquals(c.calcWeight('-'), 9);
			assertEquals(c.calcWeight('h'), 131);
			assertEquals(c.calcWeight('('), 10000);
		} catch (Exception e) {
			fail("Exception");
		}

		
	}

}
