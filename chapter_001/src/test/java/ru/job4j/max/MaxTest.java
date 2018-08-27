package ru.job4j.max;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * Test
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com)
 * @version $Id$
 * @since 27.08.2018
 */
public class MaxTest {
    /**
     * Test max.
     */
        @Test
    public void whenFirstLessSecond() {
        Max maxim = new Max();
        int result = maxim.max(1, 2);
        assertThat(result, is(2));
    }
        @Test
    public void whenSecondLessFirst() {
        Max maxim = new Max();
        int result = maxim.max(2, 1);
        assertThat(result, is(2));
    }
    /**
     * Test max out of three.
     */
    @Test
    public void whenThirdIsMax() {
        Max maxim = new Max();
        int result = maxim.max(1, 2, 3);
        assertThat(result, is(3));
    }
    @Test
    public void whenFirstIsMax() {
        Max maxim = new Max();
        int result = maxim.max(3, 2, 1);
        assertThat(result, is(3));
    }
    @Test
    public void whenSecondIsMax() {
        Max maxim = new Max();
        int result = maxim.max(2, 3, 1);
        assertThat(result, is(3));
    }

}
