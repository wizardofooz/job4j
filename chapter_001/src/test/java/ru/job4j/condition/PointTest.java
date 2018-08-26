package ru.job4j.condition;

import org.junit.Test;
import static org.hamcrest.number.IsCloseTo.closeTo;
import static org.junit.Assert.assertThat;

/**
 * Test.
 *
 * @author Maxim Bardakov (wizardofooz666@gmail.com)
 * @version $Id$
 * @since 26.08.18
 */
public class PointTest {
    /**
     * Test distanceTo
     */
    @Test
    public void distanceTo() {
        Point a = new Point(50, 50);
        Point b = new Point(10, 10);
         Double result = a.distanceTo(b);
        assertThat(result, closeTo(56.6, 0.1));
    }
}
