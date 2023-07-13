package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return left > right ? left : right;
    }

    public static int max(int left, int right, int rightRight) {
        return max(left, max(right, rightRight));
    }

    public static int max(int left, int right, int rightRight, int leftLeft) {
        return max(left, max(right, rightRight, leftLeft));
    }
}
