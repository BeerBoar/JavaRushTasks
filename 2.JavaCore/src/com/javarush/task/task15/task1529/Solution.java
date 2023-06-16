package com.javarush.task.task15.task1529;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
Осваивание статического блока
*/

public class Solution {
    public static void main(String[] args) {

    }

    static {
        reset();//add your code here - добавьте код тут
    }

    public static CanFly result;

    public static void reset() {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        if (str.equals("helicopter")) result = new Helicopter();
        if (str.equals("plane")) result = new Plane(scan.nextInt());
        scan.close();//add your code here - добавьте код тут
    }
}
