package ru.job4j.array;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com)
 * @version $Id$
 * @since 31.08.2018
 */
public class Square {
    /**
     * Создаёт массив и заполняет его квадратами чисел.
     * @param bound ерхняя границв массива.
     * @return заполненный массив.
     */
    public int[] calculate(int bound) {
        int[] rst = new int[bound];
        for (int i = 1; i <= bound; i++) {
            rst[i - 1] = i * i;
        }
        return rst;
    }
}