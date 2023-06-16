package com.javarush.task.task30.task3003;

import java.util.Queue;
import java.util.concurrent.TransferQueue;

public class Producer implements Runnable{
    private Queue<ShareItem> queue;

    public Producer(TransferQueue<ShareItem> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {

    }
}
