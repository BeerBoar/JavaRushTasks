package com.javarush.task.pro.task09.task0919;

/* 
�������� ������
*/

public class Solution {
    public static void main(String[] args) {
        String string = "����� ��� ����� �������";
        System.out.println(string);
        System.out.println(reverseString(string));
    }

    public static String reverseString(String string) {
        StringBuilder stringBuilder = new StringBuilder(string);
        return stringBuilder.reverse().toString();//�������� ��� ��� ���
    }
}
