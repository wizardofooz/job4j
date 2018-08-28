package ru.job4j.loop;
/**
 * @author Maxim Bardakov (mailto:wizardofooz666@gmail.com
 * @version $Id$
 * @since 28.08.2018
 */
public class Board {
    /**
     * Рисует шахматную доску псевдографикой.
     * @param width ширина доски.
     * @param height высота доски.
     * @return факториал.
     */
    public String paint(int width, int height) {
        StringBuilder screen = new StringBuilder();
        String ln = System.lineSeparator();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                if ((i + j) % 2 == 0) {
                    screen.append("X");
                } else {
                    screen.append(" ");
                }
            }
            screen.append(ln);
        }
        return screen.toString();
    }
}
