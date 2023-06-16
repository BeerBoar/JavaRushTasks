package com.javarush.task.task31.task3101;

import java.io.*;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.EnumSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Pattern;

/* 
Проход по дереву файлов
C:\Users\Veniol\Desktop\dest.txt
*/

public class Solution {
    public static void main(String[] args) {
        File dir = new File(args[0]);
        File result = new File(args[1]);
        StringBuilder stringBuilder = new StringBuilder();
        try {
            Files.walkFileTree(dir.toPath(), new MyFileVisitor(stringBuilder)); // обход дерева файлов через walkFileTree
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(stringBuilder);
  //      add(dir, result, stringBuilder);
    }

 // public static void add(File file, File result, StringBuilder stringBuilder) { //рекурсивный обход дерева файлов
 //     if (file.isDirectory() && file.listFiles() != null) {
 //         for (File f : file.listFiles()) {
 //             add(f, result, stringBuilder);
 //         }
 //     } else if (file.length() > 50) {
 //         try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
 //             while (reader.ready()) {
 //                 stringBuilder.append(reader.readLine()).append("\n");
 //             }
 //             stringBuilder.append("\n");
 //         } catch (IOException e) {
 //             throw new RuntimeException(e);
 //         }
 //     }
 //     try (BufferedWriter writer = new BufferedWriter(new FileWriter(result))) {
 //         writer.write(stringBuilder.toString());
 //     } catch (IOException e) {
 //         throw new RuntimeException(e);
 //     }
 // }
}