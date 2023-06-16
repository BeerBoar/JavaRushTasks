package com.javarush.task.task18.task1819;

import java.io.*;

/* 
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) {
        try {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String str1 = reader.readLine();
            String str2 = reader.readLine();
            reader.close();
            InputStream is1 = new BufferedInputStream(new FileInputStream(str1));
            is1.readAllBytes();
            FileOutputStream fos = new FileOutputStream(str1);
            new BufferedInputStream(new FileInputStream(str2)).transferTo(fos);
            is1.transferTo(fos);
            is1.close();
            fos.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
