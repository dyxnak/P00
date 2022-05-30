import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorTest {

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
	public void testAdd() {
		int a = 1234;
		int b = 4321;
		
		Calculator cal = new Calculator();
		int actual = cal.add(a, b);
		
		assertEquals (5555, actual);
	}

	@Test
	public void testSubtract() {
		int a = 10;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.subtract(a, b);
		
		assertEquals (5, actual);
	}
	
	@Test
	public void testMultiply() {
		int a = 10;
		int b = 5;

		Calculator cal = new Calculator();
		int actual = cal.multiply(a, b);
		
		assertEquals (50, actual);
	}
	
	@Test
	public void testDivide() {
		int a = 10;
		int b = 5;
		
		Calculator cal = new Calculator();
		int actual = cal.divide(a, b);
		
		assertEquals (2, actual);
	}

}
