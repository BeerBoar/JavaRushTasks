package com.javarush.task.task16.task1617;

/* 
Отсчет на гонках
*/

public class Solution {
    public static volatile int numSeconds = 3;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        Thread.sleep(3500);
        if (!clock.isInterrupted()) clock.interrupt();//add your code here - добавь код тут
    }

    public static class RacingClock extends Thread {
        public RacingClock() {
            start();
        }

        public void run() {
            while (!Thread.currentThread().isInterrupted() && numSeconds > 0) {
                try {
                    for (int i = 0; i < numSeconds; numSeconds--) {
                        System.out.print(numSeconds+" ");
                        Thread.sleep(1000);
                    }
                    System.out.println("Марш!");//add your code here - добавь код тут
                } catch (InterruptedException e) {
                    System.out.print("Прервано!");
                    Thread.currentThread().interrupt();
                }
            }
        }
    }
}
