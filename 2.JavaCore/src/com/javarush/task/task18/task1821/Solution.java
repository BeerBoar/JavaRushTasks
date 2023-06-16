package com.javarush.task.task18.task1821;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            Map<Integer, Integer> map = new HashMap<>();
            while (reader.ready()) {
                char[] array = reader.readLine().toCharArray();
                for (char c : array) {
                    map.putIfAbsent((int) c, 0);
                    map.replace((int) c, map.get((int) c) + 1);
                }
            }
            map.keySet().stream().sorted().forEach(x -> System.out.println(((char) x.intValue()) + " " + map.get(x)));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
