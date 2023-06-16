package com.javarush.task.pro.task14.task1404;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

/* 
�������� �������������-3
*/

public class Solution {

    public static final String PROMPT_STRING = "������� ����� ��������, ��� exit ��� ������: ";
    public static final String EXIT = "exit";
    public static final String ANSWERING = "�������� ";
    public static final String NOT_EXIST = "�������� � ����� ������� �� ����������";
    public static final String INTEGER_REQUIRED = "����� ������ ����� �����";

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

            try {
                int studentId = Integer.parseInt(input);
                System.out.println(ANSWERING + studentsJournal.get(studentId));
            } catch (NumberFormatException a) {
                System.out.println(INTEGER_REQUIRED);
            }
            catch (ArrayIndexOutOfBoundsException a) {
                System.out.println(NOT_EXIST);
            }
        }
    }
}
