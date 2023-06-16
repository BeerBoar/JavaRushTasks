package com.javarush.task.task19.task1909;

import java.io.*;
import java.util.ArrayList;

/* 
Замена знаков
C:\Users\Veniol\Desktop\src.txt
C:\Users\Veniol\Desktop\dest.txt
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
             BufferedWriter writer = new BufferedWriter(new FileWriter(r.readLine()))) {
            while (reader.ready()) {
                writer.write(reader.readLine().replaceAll("\\.", "!"));
            }
        }
    }
}
