package ru.job4j.loop;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 27.08.2018
 */
public class Counter {
    /**
     * Вычисляет сумму чётных чисел в заданном диапазоне.
     * @param start нижняя граница диапазона.
     * @param finish верхняя граница диапазона.
     * @return сумма.
     */
    public int add(int start, int finish) {
        int temp = 0;
        for (int i = start; i <= finish; i++) {
            if (i % 2 == 0) {
                temp = temp + i;
            }
        }
        return temp;
    }
}
