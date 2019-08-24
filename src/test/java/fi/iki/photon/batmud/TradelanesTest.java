package fi.iki.photon.batmud;

import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.Test;

public class TradelanesTest {

	@Test
	public void test() {
		int ex;
		
		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelanes-notexists", 4000, 5000, 4000, 5000, -4097, -4097);
			ex = 1;
		} catch (IOException e) {
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed2", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed2")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed3", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed3")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);
		
		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed4", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed4")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);
/*
		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("testdata/tradelane.badlyformed5", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			e.printStackTrace();
			if (e.toString().equals("java.io.IOException: Malformed tradelane")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);
*/
		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed6", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed6")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed7", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed src/test/testdata/tradelane.badlyformed7")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		ex = 0;
		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.badlyformed8", 4000, 5000, 4000, 5000, -4097, -4097);
		} catch (IOException e) {
			if (e.toString().equals("java.io.IOException: Malformed tradelane")) {
				ex = 1;
			}
		}
		assertEquals(ex, 1);

		try {
			Tradelanes tl = new Tradelanes("src/test/testdata/tradelane.txt", 4000, 5000, 4000, 5000, -4097, -4097);
			
			assertTrue(tl.isOnTradeLane(4500 - 4097, 4500 - 4097));

			assertTrue(tl.isOnTradeLane(4600 - 4097, 4500 - 4097));
			assertFalse(tl.isOnTradeLane(4601 - 4097, 4500 - 4097));
			assertFalse(tl.isOnTradeLane(4500 - 4097, 4601 - 4097));
			assertFalse(tl.isOnTradeLane(4601 - 4097, 4601 - 4097));
			assertFalse(tl.isOnTradeLane(4399 - 4097, 4601 - 4097));
			assertFalse(tl.isOnTradeLane(4399 - 4097, 4500 - 4097));
			assertFalse(tl.isOnTradeLane(4399 - 4097, 4399 - 4097));
			assertFalse(tl.isOnTradeLane(4500 - 4097, 4399 - 4097));
			assertFalse(tl.isOnTradeLane(4601 - 4097, 4399 - 4097));

			assertTrue(tl.isOnTradeLane(4550 - 4097, 4550 - 4097));
			assertTrue(tl.isOnTradeLane(4551 - 4097, 4551 - 4097));
			
			assertTrue(tl.isOnTradeLane(4500 - 4097, 4520 - 4097));
			assertTrue(tl.isOnTradeLane(4490 - 4097, 4510 - 4097));
			assertTrue(tl.isOnTradeLane(4470 - 4097, 4500 - 4097));
			assertTrue(tl.isOnTradeLane(4460 - 4097, 4460 - 4097));
			assertTrue(tl.isOnTradeLane(4500 - 4097, 4445 - 4097));
			assertTrue(tl.isOnTradeLane(4585 - 4097, 4415 - 4097));

			
		} catch (IOException e) {
			fail ("Exception");
		}
		
		
		
	}

}
