package com.javarush.task.task13.task1319;

import java.io.*;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

/* 
Писатель в файл с консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            Path path = Path.of(reader.readLine());
            try (BufferedReader fileReader = new BufferedReader(new FileReader(path.toFile()))){
                OutputStreamWriter writer = new OutputStreamWriter(System.out);
                System.out.println("Введите имя файла. Нажимайте Enter, если хотите прочитать строку. Для вывода всех строк введите exit.");
                List<String> list = new ArrayList<>();
                int n = 0;
                while(!(reader.readLine().equalsIgnoreCase("exit"))){
                    if (fileReader.ready()){
                        n++;
                        list.add(fileReader.readLine());
                    }else{
                        System.out.println("Больше нет строк!");
                    }
                    System.out.println("Считано строк: " + n);
                }
                list.forEach(System.out::println);
            }
        }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
