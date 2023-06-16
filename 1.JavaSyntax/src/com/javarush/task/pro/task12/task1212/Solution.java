package com.javarush.task.pro.task12.task1212;

public class Solution {

    public static int a = 0;
    public static void main(String []args){
        System.out.println(a);
        plus(1);
        System.out.println(a);
    }
    public static void plus (int b){
        a = a + b;
        System.out.println(a);
    }
}
