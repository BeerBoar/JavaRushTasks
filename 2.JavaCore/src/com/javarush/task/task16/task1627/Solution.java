package com.javarush.task.task16.task1627;

import java.util.ArrayList;
import java.util.List;

/* 
��������?
*/

public class Solution {
    public static void main(String[] args) throws InterruptedException {
        OnlineGame onlineGame = new OnlineGame();
        onlineGame.start();
    }

    public static class OnlineGame extends Thread {
        public static volatile boolean isWinnerFound = false;

        public static List<String> steps = new ArrayList<String>();

        static {
            steps.add("������ ����");
            steps.add("���� ��������");
            steps.add("���� ���������");
            steps.add("�������� ������");
        }

        protected Gamer gamer1 = new Gamer("Ivanov", 3);
        protected Gamer gamer2 = new Gamer("Petrov", 1);
        protected Gamer gamer3 = new Gamer("Sidorov", 5);

        public void run() {
            gamer1.start();
            gamer2.start();
            gamer3.start();

            while (!isWinnerFound) {
            }
            gamer1.interrupt();
            gamer2.interrupt();
            gamer3.interrupt();
        }
    }

    public static class Gamer extends Thread {
        private int rating;
        private int step = 0;

        public Gamer(String name, int rating) {
            super(name);
            this.rating = rating;
        }

        @Override
        public void run() {

            try {
                while (step < 4) {
                    sleep(1000 / rating);
                    System.out.println(getName() + ":" + OnlineGame.steps.get(step++));
                }
            } catch (InterruptedException e) {
                System.out.println(getName() + ":��������");
                Thread.currentThread().interrupt();
            }
            if (!OnlineGame.isWinnerFound){
                System.out.println(getName() + ":����������!");
                OnlineGame.isWinnerFound = true;
            }
        }
    }
}
