package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream input = new FileInputStream(reader.readLine())){
            String f1 = reader.readLine();
            String f2 = reader.readLine();
            byte[] buffer = new byte[input.available()];
            input.read(buffer);
            
            try(FileOutputStream output1 = new FileOutputStream(f1);
                FileOutputStream output2 = new FileOutputStream(f2)){
                int mid = buffer.length % 2 == 1 ? buffer.length / 2 + 1 : buffer.length / 2;
                output1.write(buffer,0, mid);
                output2.write(buffer, mid, buffer.length - mid);
            }

        }
    }
}
