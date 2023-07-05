package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double firstOperation = x2 - x1;
        double secondOperation = y2 - y1;
        double thirdOperation = Math.pow(firstOperation, 2);
        double fourOperation = Math.pow(secondOperation, 2);
        double fiveOperation = thirdOperation + fourOperation;
        double rsl = Math.sqrt(fiveOperation);
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = Point.distance(0, 0, 2, 0);
        System.out.println("result (0, 0) to (2, 0) = " + result1);
        double result2 = Point.distance(5, 5, 6, 7);
        System.out.println("result (5, 5) to (6, 7) = " + result2);
    }
}
