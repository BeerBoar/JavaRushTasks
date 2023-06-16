package com.javarush.task.pro.task16.task18.task1804;


import java.util.Optional;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
            int n = new Scanner(System.in).nextInt();
            for (int i = 1; i <= n; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.printf("%c%c", (char) (j + 64), (char) (j + 96));}
                System.out.println("");}
    }
}