package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class CheckTest {
    @Test
    public void whenDataMonoByTrueThenTrue() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, true, true};
        boolean result = check.mono(input);
        assertThat(result, is(true));
    }

    @Test
    public void whenDataNotMonoByTrueThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, true};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
    @Test
    public void whenDataNotMonoByFalseThenFalse() {
        Check check = new Check();
        boolean[] input = new boolean[] {true, false, false};
        boolean result = check.mono(input);
        assertThat(result, is(false));
    }
}
