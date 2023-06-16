package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine())){
            byte[] buffer = new byte[stream.available()];
            stream.read(buffer);
            Set<Byte> set = new HashSet<>();
            for(byte b:buffer){
                set.add(b);
            }
            Byte[] array = set.toArray(new Byte[0]);
            Arrays.stream(array).sorted(Comparator.comparingInt(Object::hashCode)).forEach(x-> System.out.print(x + " "));
        }
    }
}

