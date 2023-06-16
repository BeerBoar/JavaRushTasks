package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Hippodrome {
    private List<Horse> horses;

    public List<Horse> getHorses() {
        return horses;
    }
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> list = new ArrayList<>();
        list.addAll(Arrays.asList(new Horse ("Red",3.0,0),new Horse ("Green",3.0,0),new Horse ("Blue",3.0,0)));
        game = new Hippodrome(list);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i<100;i++){
            move();
            print();
            Thread.sleep(200);
        }
    }

    public void move(){
        for(Horse horse : horses){
            horse.move();
        }
    }

    public void print(){
        for(Horse horse : horses){
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public Horse getWinner(){
        return horses.stream().max((x,y)-> (int) (x.getDistance() - y.getDistance())).get();
    }

    public void printWinner(){
        System.out.printf("Winner is %s!\n", getWinner().getName());
    }
}
