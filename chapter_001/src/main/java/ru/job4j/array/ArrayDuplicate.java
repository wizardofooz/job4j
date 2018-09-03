package ru.job4j.array;

import java.util.Arrays;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class ArrayDuplicate {
    /**
     * Удаляет дубликаты из массива.
     * @param array исходный массив.
     * @return отредактированный массив.
     */
    public String[] remove(String[] array) {
        int count = 0;
        for (int i = 0; i < array.length - count; i++) {
            int j = i + 1;
            while (j < array.length - count) {
                if (array[i].equals(array[j])) {
                    count++;
                    String temp = array[j];
                    array[j] = array[array.length - count];
                    array[array.length - count] = temp;
                } else {
                    j++;
                }
            }
        }
        array = Arrays.copyOf(array, array.length - count);
        return array;
    }
}


