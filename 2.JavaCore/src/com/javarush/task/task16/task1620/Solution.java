package com.javarush.task.task16.task1620;

import java.util.ArrayList;
import java.util.List;

/* 
���� ��� ����, ��� - ��� ������
*/

public class Solution {
    public static byte threadCount = 3;
    static List<Thread> threads = new ArrayList<Thread>(threadCount);

    public static void main(String[] args) throws InterruptedException {
        initThreadsAndStart();
        Thread.sleep(3000);
        ourInterruptMethod();
    }

    public static void ourInterruptMethod() {
        threads.forEach(x->x.interrupt());//add your code here - ������ ��� ���
    }

    private static void initThreadsAndStart() {
        Water water = new Water("water");
        for (int i = 0; i < threadCount; i++) {
            threads.add(new Thread(water, "#" + i));
        }

        for (int i = 0; i < threadCount; i++) {
            threads.get(i).start();
        }
    }

    public static class Water implements Runnable {
        private String sharedResource;

        private boolean isCurrentThreadInterrupted = Thread.currentThread().isInterrupted();

        public Water(String sharedResource) {
            this.sharedResource = sharedResource;
        }

        public void run() {
            //fix 2 variables - ������� 2 ����������

            String threadName = Thread.currentThread().getName();

            try {
                while (!isCurrentThreadInterrupted) {
                    System.out.println("������ " + sharedResource + ", ���� " + threadName);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}
