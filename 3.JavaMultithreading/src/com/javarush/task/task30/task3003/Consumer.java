package com.javarush.task.task30.task3003;

import java.util.Queue;
import java.util.concurrent.TransferQueue;

public class Consumer implements Runnable {
    private Queue<ShareItem> queue;

    public Consumer(Queue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
