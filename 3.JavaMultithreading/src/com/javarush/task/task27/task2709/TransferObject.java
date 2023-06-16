package com.javarush.task.task27.task2709;

public class TransferObject {
    private int value;
    protected volatile boolean isValuePresent = false; //use this variable

    public synchronized int get() {
        while (!isValuePresent){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        int tmp = value;
        isValuePresent = false;
        notify();
        System.out.println("Got: " + tmp);
        return tmp;
    }

    public synchronized void put(int value)  {
        while (isValuePresent){
            try {
                wait();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
            this.value = value;
            System.out.println("Put: " + value);
            isValuePresent = true;
            notify();
    }
}
