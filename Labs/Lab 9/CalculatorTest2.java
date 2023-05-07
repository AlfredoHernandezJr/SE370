import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest2 {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testAdd() {
		Calculator calculator = new Calculator();
		int a = 3;
		int b = 3;
		int actual = calculator.add(a, b);
		
		int expected = 6;
		
		assertEquals(expected, actual);
	}

	@Test
	void testSubtract() {
		
			Calculator calculator = new Calculator();
			int a = 3;
			int b = 3;
			int actual = calculator.subtract(a, b);
			
			int expected = 0;
			
			assertEquals(expected, actual);
	}

}
