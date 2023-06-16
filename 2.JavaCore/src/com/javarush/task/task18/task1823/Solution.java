package com.javarush.task.task18.task1823;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/* 
Нити и байты
*/

public class Solution {
    public static Map<String, Integer> resultMap = new HashMap<String, Integer>();

    public static void main(String[] args) {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String str = reader.readLine();
            while (!"exit".equals(str)) {
                Thread thread = new ReadThread(str);
                thread.start();
                str = reader.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static class ReadThread extends Thread {
        Map<String,Integer> resultMap = new HashMap<>();
        String fileName;
        public ReadThread(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            int[] array = new int[256];
            try(BufferedInputStream stream = new BufferedInputStream(new FileInputStream(fileName))) {
                while (stream.available()>0) {
                    int i = stream.read();
                    array[i] += 1;
                }
                int maxCount = 0;
                int maxCountByte = 0;
                for (int i = 0; i < array.length; i++) {
                    if (array[i] > maxCount) {
                        maxCount = array[i];
                        maxCountByte = i;
                    }
                }
                resultMap.put(fileName,maxCountByte);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        // implement file reading here - реализуйте чтение из файла тут
    }
}
