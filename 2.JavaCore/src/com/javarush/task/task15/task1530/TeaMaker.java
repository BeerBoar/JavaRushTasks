package com.javarush.task.task15.task1530;

public class TeaMaker extends DrinkMaker{
    @Override
    void getRightCup() {
        System.out.println("����� ����� ��� ���");
    }

    @Override
    void putIngredient() {
        System.out.println("�������� ���");
    }

    @Override
    void pour() {
        System.out.println("�������� ��������");
    }
}
