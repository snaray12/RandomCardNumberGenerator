package fake;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import fake.cardnumbergenerator.RandomNumberGenerator;


public class TestRandomNumberGenerator {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testGetMin() {
		long expected = 1000000L;
		long actual = RandomNumberGenerator.getMin(7);
		assertEquals(expected,actual);
	}
}
