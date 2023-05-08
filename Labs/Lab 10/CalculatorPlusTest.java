import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorPlusTest {

    @Test
    void add() {
        CalculatorPlus calculator = new CalculatorPlus();
        int a = 1234;
        int b = 5678;
        int actual = calculator.add(a, b);

        int expected = 6912;

        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        CalculatorPlus calculator = new CalculatorPlus();
        int a = 100;
        int b = 10;
        int actual = calculator.subtract(a, b);

        int expected = 90;

        assertEquals(expected, actual);
    }

    @Test
    void factorial() {
        CalculatorPlus calculator = new CalculatorPlus();
        int a = 5;
        int actual = calculator.factorial(a);

        int expected = 120;

        assertEquals(expected, actual);
    }

    @Test
    void flipSign() {
        CalculatorPlus calculator = new CalculatorPlus();
        int a = 5;
        int actual = calculator.flipSign(a);

        int expected = -5;

        assertEquals(expected, actual);
    }

    @Test
    void square() {
        CalculatorPlus calculator = new CalculatorPlus();
        int a = 5;
        int actual = calculator.square(a);

        int expected = 25;

        assertEquals(expected, actual);
    }

    @Test
    void squareRoot() {
        CalculatorPlus calculator = new CalculatorPlus();
        double a = 81;
        double actual = calculator.squareRoot(a);

        double expected = 9;

        assertEquals(expected, actual);
    }

    @Test
    void se() {
        CalculatorPlus calculator = new CalculatorPlus();
        String actual = calculator.se();

        String expected = "softwareengineering";

        assertEquals(expected, actual);
    }
}