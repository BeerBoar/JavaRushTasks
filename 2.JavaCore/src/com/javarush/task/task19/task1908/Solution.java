package com.javarush.task.task19.task1908;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Выделяем числа
C:\Users\Veniol\Desktop\src.txt
C:\Users\Veniol\Desktop\dest.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(r.readLine()))) {
            Pattern pattern = Pattern.compile("\\b\\d+?\\b");
            while (reader.ready()) {
                Matcher matcher = pattern.matcher(reader.readLine());
                while (matcher.find()) {
                    writer.write(matcher.group()+" ");
                }
            }
        }
    }
}
