package ru.job4j.array;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class Check {
    /**
     * Проверяет однородность массива.
     * @param data массив boolean.
     * @return однороден или нет.
     */
    public boolean mono(boolean[] data) {
        boolean result = false;
        int counter = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i]) {
                counter++;
            }
        }
        if (counter == data.length || counter == 0) {
                result = true;
        }
        return result;
    }
}