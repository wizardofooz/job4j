package ru.job4j.array;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 31.08.2018
 */
public class FindLoop {
    /**
     * Определяет есть ли в массиве искомое число.
     * @param data массив.
     * @param el число.
     * @return индекс числа в массиве.
     */
    public int indexOf(int[] data, int el) {
        int rst = -1;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == el) {
                rst = index;
                break;
            }
        }
        return rst;
    }
}