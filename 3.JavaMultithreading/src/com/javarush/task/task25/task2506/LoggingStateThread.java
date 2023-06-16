package com.javarush.task.task25.task2506;

public class LoggingStateThread extends Thread {
    Thread thread;

    public LoggingStateThread(Thread thread) {
        this.thread = thread;
    }

    @Override
    public void run() {
        State state = null;
        do {
            if (thread.getState() != state) {
                state = thread.getState();
                System.out.println(state);
            }
        } while (state != State.TERMINATED);
    }
}
