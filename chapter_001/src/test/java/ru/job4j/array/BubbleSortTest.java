package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class BubbleSortTest {
    @Test
    public void sortingOfAMassive() {
        BubbleSort bs = new BubbleSort();
        int[] result = bs.sort(new int[]{5, 1, 2, 7, 3});
        assertThat(result, is(new int[] {1, 2, 3, 5, 7}));
    }

}
