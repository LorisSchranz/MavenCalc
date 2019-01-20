package ch.bbw;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest{
    Calculator calculator;
    @Before
    public void setup(){
        calculator = new Calculator();
    }
    @Test
    public void testSummeZweiPositiveIsOk() {
        assertEquals(calculator.sum(10,25),35);
    }

    @Test(expected = ArithmeticException.class)
    public void testSummeOverflow() {
        assertEquals((long) Integer.MAX_VALUE + 1, calculator.sum(Integer.MAX_VALUE, 1));
    }

    @Test
    public void testSubtraktionZweiPositiveIsOk() {
        assertEquals(calculator.subtraction(25,10),15);
    }

    @Test(expected = ArithmeticException.class)
    public void testSubtractionOverflow() {
        assertEquals((long) Integer.MIN_VALUE - 1, calculator.subtraction(Integer.MIN_VALUE, 1));
    }

    @Test
    public void testMultiplicationZweiPositiveIsOk() {
        assertEquals(calculator.multiplication(25,10),250);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingMultiplication() {
        assertEquals((long) Integer.MAX_VALUE * 2, calculator.multiplication(Integer.MAX_VALUE, 2));
    }

    @Test
    public void testDivisionZweiPositiveIsOk() {
        assertEquals(calculator.division(30,10),3);
    }

    @Test(expected = ArithmeticException.class)
    public void testOverflowHandlingDivision() {
        assertEquals((long) Integer.MAX_VALUE / 0, calculator.division(Integer.MAX_VALUE, 0));
    }
}