package com.javarush.task.pro.task17.task1703;

import java.util.ArrayList;

/* 
����������� ������� �.1
*/

public class Solution {
    public static ArrayList<Astronaut> astronauts = new ArrayList<>();

    public static void main(String[] args) {
        createCrew();
        printCrewInfo();
    }

    public static void createCrew(){
        Human hum1 = new Human();
        Human hum2 = new Human();
        Cat cat = new Cat();
        Dog dog = new Dog();
        astronauts.add(hum1);//�������� ��� ��� ���
        astronauts.add(hum2);
        astronauts.add(cat);
        astronauts.add(dog);
    }

    public static void printCrewInfo() {
        System.out.println("�� ���� ��������� ����� �������: ");
        for (Astronaut astronaut : astronauts) {
            System.out.println(astronaut.getInfo());
        }
    }
}
