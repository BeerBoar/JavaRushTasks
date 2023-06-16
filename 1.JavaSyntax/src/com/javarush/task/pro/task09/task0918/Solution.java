package com.javarush.task.pro.task09.task0918;

/* 
���������� �� StringBuilder
*/

public class Solution {
    public static void main(String[] args) {
        String string = "�������, ������� � ��� ��� �������! ";

        System.out.println(addTo(string, new String[]{"��� ", "������� ", "������ ", "���� ", "�� ", "�����"}));
        System.out.println(replace(string, ", ", 16, 27));
    }

    public static StringBuilder addTo(String string, String[] strings) {
        StringBuilder stringBuilder = new StringBuilder(string);
        for (String str : strings){
            stringBuilder.append(str);
        }
        return stringBuilder;
    }

    public static StringBuilder replace(String string, String str, int start, int end) {
        StringBuilder stringBuilder = new StringBuilder(string);
        stringBuilder.replace(start, end, str);//�������� ��� ��� ���
        return stringBuilder;
    }
}
