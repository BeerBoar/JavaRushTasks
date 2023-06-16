package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Клубок
*/

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Collections.addAll(threads, new Thread1(), new Thread2(), new Thread3(), new Thread4(), new Thread5());
    }

    public static void main(String[] args) {
        Thread t1 = new Thread1();

    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {
            }
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }

    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Ура");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run(){
            while (!isInterrupted()) {}
        }

        @Override
        public void showWarning() {
            this.interrupt();
        }
    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
                String str = "";
                int sum = 0;
                while (!((str = reader.readLine()).equals("N"))) {
                    sum += Integer.parseInt(str);
                }
                System.out.println(sum);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }
}