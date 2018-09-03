package ru.job4j.array;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 02.09.2018
 */
public class MatrixCheck {
    /**
     * Проверяет диагонали матрицы на однородность.
     * @param data матрица.
     * @return однородны или нет.
     */
    public boolean mono(boolean[][] data) {
        boolean result = true;
          for (int i = 1; i < data.length; i++) {
              if (data[i][i] != data[i - 1][i - 1] || data[data.length - i][data.length - i] != data[data.length - i - 1][data.length - i - 1]) {
                  result = false;
                  break;
              }
        }


        return result;
    }
}