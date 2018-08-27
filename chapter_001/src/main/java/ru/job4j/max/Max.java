package ru.job4j.max;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 27.08.2018
 */
public class Max {
    /**
     * Вычисляет максимум из двух чисел.
     * @param first первое число.
     * @param second второе число.
     * @return максимальное из двух.
     */
    public int max(int first, int second) {
        return first > second ? first : second;
    }
}
