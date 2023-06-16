package com.javarush.task.task18.task1820;

import java.io.*;
import java.util.Arrays;

/* 
Округление чисел
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            reader.close();
            BufferedReader fr = new BufferedReader(new FileReader(str1));
            BufferedWriter fw = new BufferedWriter(new FileWriter(str2));
            while (fr.ready()) {
                Arrays.stream(fr.readLine().split(" ")).
                        map(Double::parseDouble).
                        map(Math::round).
                        forEach(x -> {
                            try {
                                fw.write(x + " ");
                            } catch (IOException e) {
                                throw new RuntimeException(e);
                            }
                        });
            }
            fw.close();
            fr.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}
