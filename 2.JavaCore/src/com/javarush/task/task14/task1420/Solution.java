package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        NOD(a,b);

    }
    public static void NOD(int a, int b){
        if (a%b==0){
            System.out.println(b);
        }else{
            NOD(b,a%b);
        }
    }
}
