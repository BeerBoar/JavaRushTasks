package com.javarush.task.pro.task15.task1506;

import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;

/*
Фейсконтроль
*/

public class Solution {
    public static void main(String[] args) {
        try(Scanner scan = new Scanner(System.in)){
            List<String> lines = Files.readAllLines(Path.of(scan.nextLine()));
            for (String line : lines){
                char[] array = line.toCharArray();
                for (char n : array){
                    if (n != ' ' && n != '.' && n != ',') {
                        System.out.print(n);
                    }
                }
            }
        }catch (Exception e){
        }
    }
}

