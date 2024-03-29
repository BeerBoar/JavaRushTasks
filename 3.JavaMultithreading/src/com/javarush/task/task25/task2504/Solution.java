package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

public class Solution {
    public static void processThreads(Thread... threads) {
        for (Thread thread:threads){
            switch (thread.getState()){
                case NEW:{
                    thread.start();
                    break;
                }
                case RUNNABLE:{
                    thread.isInterrupted();
                    break;
                }
                case WAITING:
                case BLOCKED:
                case TIMED_WAITING:{
                    thread.interrupt();
                    break;
                }
                case TERMINATED: {
                    System.out.println(thread.getPriority());
                    break;
                }
            }
        }
        //implement this method - реализуйте этот метод
    }

    public static void main(String[] args) {
    }
}
