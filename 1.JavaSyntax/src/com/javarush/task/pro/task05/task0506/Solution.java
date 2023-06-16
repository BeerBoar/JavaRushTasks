package com.javarush.task.pro.task05.task0506;

import java.util.Scanner;

/* 
Минимальное из N чисел
*/

public class Solution {
    public static int[] array;

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int min = Integer.MAX_VALUE;
        array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = scan.nextInt();
            if (array[i]<min) {
                min = array[i];
            }
        }
        System.out.println(min);//напишите тут ваш код
    }
}
