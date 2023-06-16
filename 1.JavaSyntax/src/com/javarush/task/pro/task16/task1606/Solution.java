package com.javarush.task.pro.task16.task1606;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* 
Выход из зацикленности
*/

public class Solution {

    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date.getYear());
        System.out.println(date.getMonth());
        System.out.println(date.getMonthValue());
        System.out.println(date.getDayOfWeek());
        System.out.println(date.getDayOfMonth());
        LocalDate next = date.plusDays(1).plusYears(1);
        System.out.println(next);
    }
}
