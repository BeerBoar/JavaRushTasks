package com.javarush.task.pro.task15.task1504;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Scanner;
import java.io.*;

/*
ѕерепутанные байты
*/
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("¬ведите любые 2 слова или фразу: ");
        String phrase1 = sc.nextLine();
        String phrase2 = sc.nextLine();
        System.out.println(phrase1 + " " + phrase2);
        try(InputStream input = Files.newInputStream(Path.of(phrase1));
            OutputStream output = Files.newOutputStream(Path.of(phrase2))){
            while (input.available() > 0){
                byte[] buffer = new byte[2];
                byte[] tmp = new byte[2];
                int real = input.read(buffer);
                for (int i =0, n = tmp.length - 1; i< buffer.length; i++, n--){
                    tmp[n] = buffer[i];
                }
                if (real == 2) {
                    output.write(tmp);
                } else{
                    output.write(tmp[1]);
                }
            }
        }catch (IOException e){
        }

    }
}
