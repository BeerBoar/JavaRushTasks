package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws IOException{
       try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileInputStream input = new FileInputStream(reader.readLine());
            FileOutputStream output = new FileOutputStream(reader.readLine())){
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            for (int i = buffer.length-1; i>=0;i--){
                output.write(buffer[i]);
            }
        }
    }
}
