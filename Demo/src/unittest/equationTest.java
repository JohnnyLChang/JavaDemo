package unittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import equation.Equation;

public class equationTest {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testEquation() {
		Equation obj = new Equation();
		obj.set("x^3+6x^2+x+4");
		assertTrue(obj.compile());
		assertTrue( 0 < obj.execute());
	}

}
