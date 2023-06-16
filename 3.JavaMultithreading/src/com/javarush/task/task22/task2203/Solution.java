package com.javarush.task.task22.task2203;

/* 
Между табуляциями
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            Pattern pattern = Pattern.compile("\\t.+?\\t");
            Matcher matcher = pattern.matcher(string);
            matcher.find();
            return matcher.group().replaceAll("\\t", "");
        }catch (Throwable e){
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
