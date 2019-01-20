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

}