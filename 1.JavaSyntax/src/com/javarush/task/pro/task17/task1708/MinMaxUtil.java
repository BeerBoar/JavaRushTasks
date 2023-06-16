package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class MinMaxUtil {
    public  static int min(int a, int b){
        int[] array = new int[2];
        array[0] = a;
        array[1] = b;
        Arrays.sort(array);
        return array[0];
    }
    public static int min (int ... ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ints) {
            list.add(i);
        }
        return Collections.min(list);
    }
    public static int max (int ... ints){
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : ints) {
            list.add(i);
        }
        return Collections.max(list);
    }

    public static void main(String[] args) {
        System.out.println(min(1,2,3,4,5,6,7,8,9,10,0));
    }//напишите тут ваш код
}
