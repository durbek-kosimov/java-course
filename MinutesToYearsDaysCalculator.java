package com;

public class MinutesToYearsDaysCalculator {
    public static void printsYearsAndDays(long minutes) {
        int years, days;
        if (minutes < 0)
            System.out.println("Invalid Value.");

        else if ((int)(minutes / 24 / 60 / 365) < 1) {
            years = 0;
            days = (int) (minutes / 24 / 60);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
        else {
            years = (int) (minutes / 24 / 60 / 365);
            days = (int)(minutes / 24 / 60 % 365);
            System.out.println(minutes + " min = " + years + " y and " + days + " d");
        }
    }
}
