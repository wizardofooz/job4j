package ru.job4j.condition;
/**
 * Point
 * @author Maxim Bardakov (wizardofooz666@gmail.com)
 */
public class Point {
    private int x;
    private int y;

    public  Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    /**
     * Method distanceTo вычисляет расстояние от одной
     * координатной точки до другой
     * @param that точка до которой вычисляется расстояние
     * @return вычисленное расстояние
     */
    public double distanceTo(Point that) {
        return Math.sqrt(
                Math.pow(this.x - that.x, 2) + Math.pow(this.y - that.y, 2)
        );
    }

}
