package com.javarush.task.task17.task1701.task1703;

import java.util.ArrayList;
import java.util.List;

/* 
������������������ �������
*/

public class Solution {
    public static Note n = new Note();
    public static void main(String[] args) {
        Thread thread = new MyThread();
        thread.start();

    }

    public static class Note {
        public final List<String> notes = new ArrayList<String>();

        public void addNote(int index, String note) {
            System.out.println("������ ����� ��������� ������� [" + note + "] �� ������� " + index);
            synchronized (notes) {
                notes.add(index, note);
            }
            System.out.println("��� ��������� ������� [" + note + "]");
        }

        public void removeNote(int index) {
            System.out.println("������ ����� ������� ������� � ������� " + index);
            String note = null;
            synchronized (notes) {
                note = notes.remove(index);
            }
            System.out.println("��� ������� ������� [" + note + "] � ������� " + index);
        }
    }
    public static class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 10; i++) {
                n.addNote(i,((Integer) i).toString());
                n.removeNote(i);
            }
        }
    }
}
