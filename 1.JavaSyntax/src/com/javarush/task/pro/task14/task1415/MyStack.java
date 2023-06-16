package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        storage.add(0, s);//напишите тут ваш код
    }

    public String pop() {
        return storage.remove(0);//напишите тут ваш код
    }

    public String peek() {
        return storage.get(0);//напишите тут ваш код
    }

    public boolean empty() {
        return storage.isEmpty();//напишите тут ваш код
    }

    public int search(String s) {
        return storage.indexOf(s);//напишите тут ваш код
    }
}
