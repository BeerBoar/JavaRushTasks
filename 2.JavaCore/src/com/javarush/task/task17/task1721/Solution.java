package com.javarush.task.task17.task1721;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Введите путь к копируемому файлу");
            String srcSrting = reader.readLine();
            System.out.println("Введите путь к целевому файлу");
            String destString = reader.readLine();
            File srcFile = new File(srcSrting);
            File destFile = new File(destString);
            if (srcFile.exists() && !srcFile.isDirectory()) {
                try (BufferedReader srcReader = new BufferedReader(new FileReader(srcFile));
                     BufferedReader destReader = new BufferedReader(new FileReader(destFile))){
                    while (srcReader.ready()) {
                        allLines.add(srcReader.readLine());
                    }
                    while (destReader.ready()) {
                        forRemoveLines.add(destReader.readLine());
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            } else {
                System.out.println("Исходный файл не найден!");
                Thread.currentThread().interrupt();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Solution solution = new Solution();
        try {
            solution.joinData();
        } catch (CorruptedDataException e) {
            throw new RuntimeException(e);
        }
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines = allLines.stream().filter(x -> !forRemoveLines.contains(x)).collect(Collectors.toList());
        } else {
            allLines.clear();
            System.out.println("Что-то пошло не так");
            throw new CorruptedDataException();
        }
    }
}
