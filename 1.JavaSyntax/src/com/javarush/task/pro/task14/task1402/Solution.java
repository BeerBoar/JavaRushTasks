package com.javarush.task.pro.task14.task1402;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
�������� �������������
*/

public class Solution {

    public static final String PROMPT_STRING = "������� ����� ��������, ��� exit ��� ������: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "�������� ";
    public static final String NOT_EXIST = "�������� � ����� ������� �� ����������";

    static List<String> studentsJournal = Arrays.asList(
            "����� ������"
            , "�������� �������"
            , "����� ������"
            , "����� �����������"
            , "������ �������"
            , "������� ����������"
            , "������ �������"
            , "������� ���������"
            , "����� ���������"
            , "������� ���������");

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print(PROMPT_STRING);
            String input = scanner.nextLine();
            if (input.toLowerCase().equals(EXIT)) {
                break;
            }

            int studentId = 0;
            try {
                studentId = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                System.out.println("Not a number!");
            }
            try {
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (Exception e) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
