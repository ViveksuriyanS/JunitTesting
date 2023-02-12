import com.rest.app.Calculator;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void addTest() {
        assertEquals(10, calculator.add(4, 6));
        assertEquals(20, calculator.add(4, 16));
    }

    @Test
    public void subtractTest() {
        assertEquals(10, calculator.subtract(20, 10));
        assertEquals(20, calculator.subtract(30, 10));
    }

    @Test
    public void multiplyTest() {
        assertEquals(10, calculator.multiply(2, 5));
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void divideTest() {
        assertEquals(10, calculator.divide(100, 10));
        assertEquals(20, calculator.divide(200, 10));
    }
}
