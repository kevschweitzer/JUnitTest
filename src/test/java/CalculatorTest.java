import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @BeforeEach
    public void setup() {

    }

    @Test
    public void additionTest() {
        int result = calculator.addition(3,2);
        assertEquals(5, result);
    }

    @Test
    public void additionWithNegativeNumber() {
        int result = calculator.addition(-3, 2);
        assertEquals(-1, result);
    }

    @Test
    public void subtractionTest() {
        int result = calculator.subtraction(3,2);
        assertEquals(1, result);
    }

    @Test
    public void divideWithYDifferentThan0Test() {
        int result = calculator.divide(6,3);
        assertEquals(2, result);
    }

    @Test
    public void divideWithYEquals0Test() {
        int result = calculator.divide(6,0);
        assertEquals(0, result);
    }

    @Test
    public void multiplyTest() {
        int result = calculator.multiply(2,3);
        assertEquals(6, result);
    }

    @Test
    public void esParTest() {
        boolean result = calculator.esPar(4);
        assertTrue(result);
    }

    @Test
    public void esParConNumeroImparTest() {
        boolean result = calculator.esPar(3);
        assertFalse(result);
    }
}
