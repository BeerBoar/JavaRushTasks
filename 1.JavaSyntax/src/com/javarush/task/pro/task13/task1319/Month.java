package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/
import java.util.Arrays;
public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month[] array = Month.values();
        Month[] result = {DECEMBER, JANUARY, FEBRUARY};
        return result;
    }
    public static Month[] getSpringMonths(){
        Month[] array = Arrays.copyOfRange(Month.values(), 2, 4);
        return array;
    }
    public static Month[] getSummerMonths(){
        Month[] array = Arrays.copyOfRange(Month.values(), 5, 7);
        return array;
    }
    public static Month[] getAutumnMonths(){
        Month[] array = Arrays.copyOfRange(Month.values(), 8, 10);
        return array;
    }//напишите тут ваш код

}
