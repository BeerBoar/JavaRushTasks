package com.javarush.task.pro.task10.task1020;

public class Computer {
    private Keyboard keyboard;
    private Monitor monitor;
    private Mouse mouse;
    private SystemUnit systemUnit;

    public Computer(Keyboard keyboard, Monitor monitor, Mouse mouse, SystemUnit systemUnit){
        this.keyboard = keyboard;
        this.monitor = monitor;
        this.mouse = mouse;
        this.systemUnit = systemUnit;
    }
}
