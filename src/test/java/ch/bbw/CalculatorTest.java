package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void setup() {
        calculator = new Calculator();
    }

    /*
    Addition
    */
    @Test
    public void testSummeZweiPositiveIsOk() {
        assertEquals(calculator.sum(10, 25), 35);
    }

    @Test(expected = ArithmeticException.class)
    public void testSummeOverflow() {
        assertEquals((long) Integer.MAX_VALUE + 1, calculator.sum(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testAdditionNegatives() {
        assertEquals(-50, calculator.sum(-10, -40));
    }

    @Test
    public void testAdditionPositiveNegative() {
        assertEquals(10, calculator.sum(20, -10));
    }

    @Test
    public void testAdditionNegativePositive() {
        assertEquals(-10, calculator.sum(-20, 10));
    }

    @Test
    public void testAdditionZero() {
        assertEquals(9, calculator.sum(0, 9));
    }

    @Test
    public void testAdditionLargeNumbers() {
        assertEquals(107734696, calculator.sum(32915164, 74819532));
    }

    @Test
    public void testAdditionRounding() {
        assertEquals(4, calculator.sum(5 / 2, 2));
    }


    @Test
    public void testDivisionByZeroNotRaised() throws StackOverflowError {
        assertEquals(calculator.division(10, 1), 10);
    }

    /*
    Subtraction
     */

    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        assertEquals(calculator.subtraction(25, 10), 15);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtractionOverflow() {
        assertEquals((long) Integer.MIN_VALUE - 1, calculator.subtraction(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testSubtractionNegatives() {
        assertEquals(-10, calculator.subtraction(-20, -10));
    }

    @Test
    public void testSubtractionPositiveNegative() {
        assertEquals(100, calculator.subtraction(90, -10));
    }

    @Test
    public void testSubtractionNegativePositive() {
        assertEquals(-100, calculator.subtraction(-90, 10));
    }

    @Test
    public void testSubtractionZero() {
        assertEquals(-30, calculator.subtraction(0, 30));
    }

    @Test
    public void testSubtractionLargeNumbers() {
        assertEquals(29917805, calculator.subtraction(64182956, 34265151));
    }

    @Test
    public void testSubtractionRounding() {
        assertEquals(9, calculator.subtraction(21 / 2, 1));
    }

    /*
    Division
     */

    @Test
    public void testDivisionNegatives() {
        assertEquals(2, calculator.division(-40, -20), 0);
    }

    @Test
    public void testDivisionPositiveNegative() {
        assertEquals(-10, calculator.division(100, -10), 0);
    }

    @Test
    public void testDivisionNegativePositive() {
        assertEquals(-10, calculator.division(-100, 10), 0);
    }

    @Test
    public void testDivisionPointNumbers() {
        assertEquals(1.5, calculator.division(3, 2), 1);
    }

    @Test
    public void testDivisionMorePointNumbers() {
        assertEquals(3.333, calculator.division(10, 3), 3);
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertEquals(calculator.division(30, 10), 3);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingDivision() {
        assertEquals((long) Integer.MAX_VALUE / 0, calculator.division(Integer.MAX_VALUE, 0));
    }


    /*
    Multiplication
     */

    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        assertEquals(calculator.multiplication(25, 10), 250);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingMultiplication() {
        assertEquals((long) Integer.MAX_VALUE * 2, calculator.multiplication(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testMultiplicationNegatives() {
        assertEquals(100, calculator.multiplication(-10, -10));
    }

    @Test
    public void testMultiplicationPositiveNegative() {
        assertEquals(-120, calculator.multiplication(20, -6));
    }

    @Test
    public void testMultiplicationNegativePositive() {
        assertEquals(-120, calculator.multiplication(-20, 6));
    }

    @Test
    public void testMultiplicationWithZero() {
        assertEquals(0, calculator.multiplication(1000, 0));
    }

    @Test
    public void testMultiplicationLargeNumbers() {
        assertEquals(447084, calculator.multiplication(33, 13548));
    }

    @Test
    public void testMultiplicationRounding() {
        assertEquals(6, calculator.multiplication(5 / 2, 3));
    }
}