package ru.job4j.condition;

public class SqArea {
    public static double square(int p, double k) {
        double weight = p / (2 * (k + 1));
        double length = weight * k;
        double rsl = length * weight;
        return rsl;
    }

    public static void main(String[] args) {
        double result = SqArea.square(6, 2);
        System.out.println(" p = 6, k = 2, s = 2, real = " + result);
    }
}
