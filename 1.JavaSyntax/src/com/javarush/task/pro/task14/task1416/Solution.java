package com.javarush.task.pro.task14.task1416;

/* 
����������� ����������
*/

public class Solution {

    public static void main(String[] args) {
        try {
            System.out.println("����� ����� �� ����");
            System.out.println(366/0);//� ���� ������� ���� ����� ��������� ����������

            System.out.println("����");
            System.out.println("���");
            System.out.println("��");
            System.out.println("�����");
            System.out.println("��������!");

        } catch (ArithmeticException e) {

            System.out.println("��������� ������������ � ���� catch!");
            System.out.println("������! ������ ������ �� ����!");
        }
    }
}
