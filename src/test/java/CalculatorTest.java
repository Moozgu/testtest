import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {

    private Calculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    void shouldAddTwoNumbers() {
        Assertions.assertEquals(10,calculator.add(5,5));
        Assertions.assertEquals(0,calculator.add(-5,5));
        Assertions.assertEquals(0,calculator.add(0,0));
        Assertions.assertEquals(-10,calculator.add(-5,-5));
    }

    @Test
    void substract() {
    }

    @Test
    void multiply() {
    }

    @Test
    void divide() {
    }
}