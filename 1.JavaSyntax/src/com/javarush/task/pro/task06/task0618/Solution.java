package com.javarush.task.pro.task06.task0618;

/* 
������� �������
*/

public class Solution {
    public static String material = "������������";
    public static String immaterial = "��������������";

    public static void main(String[] args) {
        System.out.println("�� ������ ����� �������������� ������...");

        switchSword(immaterial);//�������� ��� ��� ���
    }

    public static void switchSword(String status){
        System.out.println("��� ���������� � " + status + " �����.");
    }//�������� ��� ��� ���
}
