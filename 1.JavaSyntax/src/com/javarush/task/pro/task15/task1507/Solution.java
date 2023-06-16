package com.javarush.task.pro.task15.task1507;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/* 
Пропускаем не всех
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try (Scanner scan = new Scanner(System.in)) {
            String str = scan.nextLine();
            List<String> lines = Files.readAllLines(Path.of(str));
            for (int i = 0; i < lines.size(); i++) {
                if (i % 2 == 0) {
                    System.out.println(lines.get(i));
                }
            }
        }
    }
}

