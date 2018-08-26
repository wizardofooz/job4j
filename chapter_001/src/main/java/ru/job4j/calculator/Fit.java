package ru.job4j.calculator;

/**
 * Программа расчета идеального веса.
 */
public class Fit {

    /**
     * Идеальный вес для мужщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double manWeight(double height) {
        Calculator calc = new Calculator();
        calc.subtract(height, 100);
        calc.multiple(calc.result, 1.15D);
        return calc.getResult();
    }

    /**
     * Идеальный вес для женщины.
     * @param height Рост.
     * @return идеальный вес.
     */
    public double womanWeight(double height) {
        Calculator calc = new Calculator();
        calc.subtract(height, 110);
        calc.multiple(calc.result, 1.15D);
        return calc.getResult();
    }
}
