//package com.javarush.task.task08.task0827;

import java.util.Date;


/*
Работа с датой
*/

public class Solution5 {
    public static void main(String[] args) {
        System.out.println(isDateOdd("JANUARY 1 2000"));

    }

    public static boolean isDateOdd(String date) {
        String s = date;
        Date startTime = new Date(date);
        Date currentTime = new Date(date);
        startTime.setHours(0);
        startTime.setMinutes(0);
        startTime.setSeconds(0);
        startTime.setDate(1);
        startTime.setMonth(0);

        long timeDistance = currentTime.getTime() - startTime.getTime();

        long day = timeDistance / 24 / 60 / 60000 + 1;
        System.out.print(s + " = ");
        return day % 2 == 1;
     }
}
