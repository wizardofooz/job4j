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
        for (int i = 1; i < data.length; i++) {
            if (data[i] == data[i - 1]) {
                result = true;
            }
        }
        return result;
    }
}