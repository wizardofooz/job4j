package ru.job4j.calculator;

import org.junit.Test;
import ru.job4j.calculate.Calculate;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Bardakov (wizardofooz666@gmail.com)
 * @version $Id$
 * @since 24.08.18
 */
public class CalculatorTest {
    /**
     * Test add.
     */
    @Test
    public void whenAddOnePlusOneThenTwo() {
        Calculator calc = new Calculator();
        calc.add(1D, 1D);
        double result = calc.getResult();
        double expect = 2D;
        assertThat(result, is(expect));
    }
    /**
     * Test add.
     */
    @Test
    public void whenSubtractTwoMinusOneThenOne() {
        Calculator calc = new Calculator();
        calc.subtract(2D, 1D);
        double result = calc.getResult();
        double expect = 1D;
        assertThat(result, is(expect));
    }
    /**
     * Test div.
     */
    @Test
    public void whenDivFourToTwoThenTwo() {
        Calculator calc = new Calculator();
        calc.div(4D, 2D);
        double result = calc.getResult();
        double expect = 2D;
        assertThat(result, is(expect));
    }
    /**
     * Test multiple.
     */
    @Test
    public void whenMultipleTwoOnTwoOneThenFour() {
        Calculator calc = new Calculator();
        calc.multiple(2D, 2D);
        double result = calc.getResult();
        double expect = 4D;
        assertThat(result, is(expect));
    }
}
