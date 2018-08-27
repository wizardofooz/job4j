package ru.job4j.calculator;
/**
 *Calculator
 * @author Maxim Bardakov (wizardofooz666@gmail.com)
 */
public class Calculator {
    private double result;
    /**
     * Method add.
     * @param first first digit.
     * @param second second digit.
     * adds first digit to second.
     */
    public void add(double first, double second) {
        this.result = first + second;
    }
    /**
     * Method subtract.
     * @param first first digit.
     * @param second second digit.
     * subtracts second digit from the first.
     */
    public void subtract(double first, double second) {
        this.result = first - second;
    }
    /**
     * Method div.
     * @param first first digit.
     * @param second second digit.
     * divides first digit to second.
     */
    public void div(double first, double second) {
        this.result = first / second;
    }
    /**
     * Method multiple.
     * @param first first digit.
     * @param second second digit.
     * multiplies first digit to second.
     */
    public void multiple(double first, double second) {
        this.result = first * second;
    }
    /**
     * Method getResult.
     * @return this.result.
     */
    public double getResult() {
        return this.result;
    }
}
