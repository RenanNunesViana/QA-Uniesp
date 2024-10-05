package tech.angelofdiasg.unittests;

import org.junit.jupiter.api.Test;
import tech.angelofdiasg.calculadora.Calculator;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testFactorialOfZero() {
        assertEquals(1, calculator.factorial(0));
    }

    @Test
    void testFactorialOfPositiveNumber() {
        assertEquals(120, calculator.factorial(5));
    }

    @Test
    void testFactorialOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.factorial(-1));
    }

    @Test
    void testSumOfPositiveNumbers() {
        assertEquals(5.5, calculator.sum(2.5f, 3.0f), 0.0001);
    }

    @Test
    void testSumOfNegativeNumbers() {
        assertEquals(-5.5, calculator.sum(-2.5f, -3.0f), 0.0001);
    }

    @Test
    void testSubtractionOfPositiveNumbers() {
        assertEquals(1.5, calculator.subtraction(5.0f, 3.5f), 0.0001);
    }

    @Test
    void testSubtractionWithNegativeResult() {
        assertEquals(-1.0, calculator.subtraction(3.0f, 4.0f), 0.0001);
    }

    @Test
    void testPowerOfPositiveBase() {
        assertEquals(4, calculator.power(2, 2));
    }

    @Test
    void testPowerOfPositiveBigBase() {
        assertEquals(125, calculator.power(5, 3));
    }

    @Test
    void testPowerWithOneAsExponent() {
        assertEquals(5, calculator.power(5, 1));
    }

    @Test
    void testPowerWithZeroAsExponent() {
        assertEquals(1, calculator.power(1000, 0));
    }

    @Test
    void testPowerWithZeroAsBase() {
        assertEquals(0, calculator.power(0, 100));
    }

    @Test
    void testDivisionOfPositiveNumbers() {
        assertEquals(2.0, calculator.division(10.0f, 5.0f), 0.0001);
    }

    @Test
    void testDivisionByZero() {
        assertThrows(IllegalArgumentException.class, () -> calculator.division(10.0f, 0.0f));
    }

    @Test
    void testSquareRootOfPositiveNumber() {
        assertEquals(3.0, calculator.squareRoot(9.0), 0.0001);
    }

    @Test
    void testSquareRootOfNegativeNumber() {
        assertThrows(IllegalArgumentException.class, () -> calculator.squareRoot(-9.0));
    }

    @Test
    void testAverageOfNumbers() {
        double[] numbers = {2.0, 4.0, 6.0};
        assertEquals(4.0, calculator.average(numbers), 0.0001);
    }

    @Test
    void testMaximumValue() {
        double[] numbers = {2.0, 4.0, 6.0};
        assertEquals(6.0, calculator.maximum(numbers), 0.0001);
    }

    @Test
    void testMinimumValue() {
        double[] numbers = {2.0, 4.0, 6.0};
        assertEquals(2.0, calculator.minimum(numbers), 0.0001);
    }
}
