package com.javarush.task.pro.task05.task0508;

import java.util.Scanner;

/* 
Удаляем одинаковые строки
*/

public class Solution {
    public static String[] strings;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        strings = new String[6];
        for (int i = 0; i < 6; i++) {
            System.out.println("Введите символ:");
            strings[i]=scan.nextLine();
        }
        for (int j = 0; j<6; j++){
            for (int k = j+1; k < 6; k++){
                if (strings[j] == null){
                    break;
                }else if (strings[j].equals(strings[k])){
                    strings[j] = strings[k] = null;
                }
            }
        }
        for (int i = 0; i < strings.length; i++) {
            System.out.print(strings[i] + ", ");
        }
    }
}