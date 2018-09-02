package ru.job4j.array;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class Matrix {
    /**
     * Проводит сортировку массива пузырьком по возрастанию.
     * @param size раницы матрицы.
     * @return таблица умножения.
     */
    int[][] multiple(int size) {
        int[][] array = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                array[i][j] = (i + 1) * (j + 1);
            }
        }
        return  array;
    }
}
