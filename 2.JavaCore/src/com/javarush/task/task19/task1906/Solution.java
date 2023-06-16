package com.javarush.task.task19.task1906;

import java.io.*;
import java.util.ArrayList;

/* 
Четные символы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
        try(BufferedReader reader = new BufferedReader(new FileReader(r.readLine()));
        BufferedWriter writer = new BufferedWriter(new FileWriter(r.readLine()))) {
            int n = 1;
            while (reader.ready()) {
                int c = reader.read();
                if (n % 2 == 0) {
                    writer.write(c);
                }
                n++;
            }
        }
    }
}
