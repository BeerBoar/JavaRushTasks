package com.javarush.task.task16.task1618;

/* 
Снова interrupt
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        Thread test = new TestThread();
        test.start();
        test.interrupt();//Add your code here - добавь код тут
    }

    //Add your code below - добавь код ниже
    public static class TestThread extends Thread{
        @Override
        public void run() {
            System.out.println(Thread.currentThread().getName() + " works.");
        }
    }
}