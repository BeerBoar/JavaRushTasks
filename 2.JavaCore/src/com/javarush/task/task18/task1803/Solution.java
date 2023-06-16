package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             FileInputStream stream = new FileInputStream(reader.readLine())) {
            byte[] array = new byte[stream.available()];
            stream.read(array);
            Map<Byte,Integer> map = new HashMap<>();
            for(byte b:array){
                if(map.containsKey(b)){
                    map.replace(b, map.get(b) + 1);
                }else{
                    map.put(b,1);
                }
            }
            int max = 0;
            ArrayList<Byte> results = new ArrayList<>();
            for (Byte b : map.keySet()){
                if (map.get(b) > max){
                    max = map.get(b);
                    results.clear();
                    results.add(b);
                } else if (map.get(b) == max) {
                    results.add(b);
                }
            }
            results.forEach(x-> System.out.print(x + " "));
        }
    }
}
