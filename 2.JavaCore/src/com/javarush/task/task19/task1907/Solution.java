package com.javarush.task.task19.task1907;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Считаем слово
*/

public class Solution {
    public static void main(String[] args) {
        try(BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader reader = new BufferedReader(new FileReader(r.readLine()))) {
            Pattern pattern = Pattern.compile("\\b([w|W])orld\\b");
            int count = 0;
            while (reader.ready()) {
                Matcher matcher = pattern.matcher(reader.readLine());
                while (matcher.find()) {
                    count++;
                }
            }
            System.out.println(count);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
