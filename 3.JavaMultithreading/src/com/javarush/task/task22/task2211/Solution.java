package com.javarush.task.task22.task2211;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;

/* 
Смена кодировки
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        Charset utf = Charset.forName("UTF-8");
        Charset win = Charset.forName("Windows-1251");
        try (FileInputStream is = new FileInputStream(args[0]);
             FileOutputStream os = new FileOutputStream(args[1])){
            byte[] array = new byte[1000];
            is.read(array);
            String str = new String(array,win);
            array = str.getBytes(utf);
            os.write(array);
        }
    }
}
