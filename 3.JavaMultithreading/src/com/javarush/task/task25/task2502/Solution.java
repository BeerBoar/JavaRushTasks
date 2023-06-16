package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() {
            List<Wheel> loaded = new ArrayList<>();
            for(String str:loadWheelNamesFromDB()){
                loaded.add(Wheel.valueOf(str));
            }
            List<Wheel> tmp = new ArrayList<>(loaded);
            tmp.sort(Comparator.comparing(Enum::toString));
            if(tmp.equals(checkList())){
                wheels = loaded;
            } else{
                throw new IllegalArgumentException("Wrong data from DB");
            }
        }

        private List<Wheel> checkList(){
            List<Wheel> list = new ArrayList<>();
            list.addAll(Arrays.asList(Wheel.values()));
            list.sort(Comparator.comparing(Enum::toString));
            return list;
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) {
        Car car = new Car();
        car.wheels.forEach(System.out::println);
    }
}
