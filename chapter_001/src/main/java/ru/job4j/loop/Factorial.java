package ru.job4j.loop;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 28.08.2018
 */
public class Factorial {
    /**
     * Вычисляет факториалб указанного значения.
     * @param n значение.
     * @return факториал.
     */
    public int calc(int n) {
        int res = 1;
        for (int i = 2; i <= n; i++) {
            res *= i;
        }
        return res;
    }
}
