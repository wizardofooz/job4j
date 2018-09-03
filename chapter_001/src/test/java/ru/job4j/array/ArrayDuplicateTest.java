package ru.job4j.array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class ArrayDuplicateTest {
    @Test
    public void whenRemoveDuplicatesThenArrayWithoutDuplicate() {
        ArrayDuplicate ad = new ArrayDuplicate();
        String[] result = ad.remove(new String[] {"Cat", "Dog", "Bird", "Cat", "Dog", "Snake"});
        assertThat(result, is(new String[] {"Cat", "Dog", "Bird", "Snake"}));
    }
}