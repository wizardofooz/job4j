package ru.job4j.array;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com)
 * @version $Id$
 * @since 31.08.2018
 */
public class TurnTest {
    @Test
    public void whenTurnArrayWithEvenAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2};
        int[] result = turner.turn(input);
        int[] expect = new int[] {2, 6, 1, 4};
        assertThat(result, is(expect));
    }

    @Test
    public void whenTurnArrayWithOddAmountOfElementsThenTurnedArray() {
        Turn turner = new Turn();
        int[] input = new int[] {4, 1, 6, 2, 5};
        int[] result = turner.turn(input);
        int[] expect = new int[] {5, 2, 6, 1, 4};
        assertThat(result, is(expect));
    }
}