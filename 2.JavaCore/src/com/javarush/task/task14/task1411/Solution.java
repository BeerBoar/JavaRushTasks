package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        List<String> list = Arrays.stream(Person.Type.values()).map(Person.Type::toString).toList();
        while(list.contains(str)) {
            Person.doWork(str);
            str = reader.readLine();
        }
        reader.close();
    }
}
