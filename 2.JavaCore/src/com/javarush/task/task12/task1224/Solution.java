package com.javarush.task.task12.task1224;

/* 
Неведома зверушка
*/

import java.util.Optional;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        return switch (o.getClass().getSimpleName()){
            case "Cat" -> "Кот";
            case "Tiger" -> "Тигр";
            case "Lion" -> "Лев";
            case "Bull" -> "Бык";
            default -> "Животное";
        };
    }
    public static class Cat {
    }

    public static class Tiger {
    }

    public static class Lion {
    }

    public static class Bull {
    }

    public static class Pig {
    }
}
