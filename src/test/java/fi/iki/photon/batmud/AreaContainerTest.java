package fi.iki.photon.batmud;

import static org.junit.Assert.*;

import org.junit.Test;

public class AreaContainerTest {

	@Test
	public void testAreaContainer() {
		try {
			AreaContainer ac = new AreaContainer("src/test/testdata/ac-test");
			
		} catch (Exception e) {
			e.printStackTrace();
			fail("Exception");
		}
	}

}
