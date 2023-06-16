package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            Path path = Path.of(reader.readLine());
            if(Files.exists(path)){
                try (FileReader inputStream = new FileReader(path.toFile());
                     OutputStreamWriter writer = new OutputStreamWriter(System.out)){
                        inputStream.transferTo(writer);
                        writer.flush();
                }
            }else{
                System.out.println("Файла с таким названием не существует!");
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}