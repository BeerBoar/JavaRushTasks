package com.javarush.task.task18.task1816;

import java.io.*;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Английские буквы
*/

public class Solution {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z]");
        int count =0;
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader fr = new BufferedReader(new FileReader(reader.readLine()));
            while (fr.ready()){
                Matcher matcher = pattern.matcher(fr.readLine());
                while(matcher.find()){
                    count++;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(count);
    }
}
