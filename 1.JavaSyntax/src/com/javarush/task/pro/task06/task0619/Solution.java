package com.javarush.task.pro.task06.task0619;

/* 
����� ����������
*/

public class Solution {
    public static String[] deadMen = {"�������_1", "�������_2", "�������_3", "�������_4", "�������_5",
                                      "�������_6", "�������_7", "�������_8", "�������_9", "�������_10"};

    public static void main(String[] args) {
        for (int i = 0; i < deadMen.length; i++) {
            System.out.println(destroyDeadMan(deadMen[i]));
        }//�������� ��� ��� ���
    }

    public static String destroyDeadMan(String name){
        return name + " ��� ���������";
    }//�������� ��� ��� ���
}
