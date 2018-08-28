package ru.job4j.loop;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com)
 * @version $Id$
 * @since 28.08.2018
 */
public class FactorialTest {
    /**
     *  Testing method calc with param 5.
     */
    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        Factorial f = new Factorial();
        assertThat(f.calc(5), is(120));
    }
    /**
     *  Testing method calc with param 0.
     */
    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        Factorial f = new Factorial();
        assertThat(f.calc(0), is(1));
    }
}