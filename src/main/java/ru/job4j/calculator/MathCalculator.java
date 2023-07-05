package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumDifferenceAndSeparation(double first, double second) {
        return difference(first, second)
                + separation(first, second);
    }

    public static double sumAllOperations(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + difference(first, second)
                + separation(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета суммы и умножения равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета суммы разности и деления равен: " + sumDifferenceAndSeparation(10, 20));
        System.out.println("Результат расчета всех операций равен: " + sumAllOperations(10, 20));
    }
}
