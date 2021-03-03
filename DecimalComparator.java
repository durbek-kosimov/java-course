package com;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        int x = (int) (a * 1000);
        int y = (int) (b * 1000);
        return x - y == 0;
    }
}
