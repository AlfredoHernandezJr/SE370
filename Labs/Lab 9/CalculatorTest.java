import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculatorTest {

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
        int a = 1234;
        int b = 5678;
        int actual = calculator.add(a, b);

        int expected = 6912;

        assertEquals(expected, actual);
    }

    @Test
    void testSubtract() {
        Calculator calculator = new Calculator();
        int a = 100;
        int b = 10;
        int actual = calculator.subtract(a, b);

        int expected = 90;

        assertEquals(expected, actual);
    }

}
