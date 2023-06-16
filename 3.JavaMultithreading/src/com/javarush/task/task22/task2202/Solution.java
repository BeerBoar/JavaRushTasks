package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        try {
            String[] array = string.split(" ");
            return array[1] + " " + array[2] + " " + array[3] + " " + array[4];
        } catch (Throwable e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
