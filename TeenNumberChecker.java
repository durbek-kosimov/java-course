package com;

public class TeenNumberChecker {
    public static boolean isTeen(int a) {
        if (a > 12 && a < 20)
            return true;
        else
            return false;
    }
    public static boolean hasTeen(int a, int b, int c) {
        return isTeen(a) || isTeen(b) || isTeen(c);
    }
}
