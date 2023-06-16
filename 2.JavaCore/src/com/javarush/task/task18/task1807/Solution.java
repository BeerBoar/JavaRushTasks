package com.javarush.task.task18.task1807;

import java.io.*;
import java.util.Arrays;

/* 
Подсчет запятых
*/

public class Solution {
    public static void main(String[] args) throws IOException{
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(r.readLine())){
            byte[] buffer = new byte[stream.available()];
            stream.read(buffer);
            int sum = 0;
            for (byte b:buffer){
                if (b == ',') sum++;
            }
            System.out.println(sum);
        }
    }
}
