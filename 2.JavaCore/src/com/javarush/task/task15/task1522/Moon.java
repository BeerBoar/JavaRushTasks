package com.javarush.task.task15.task1522;

public class Moon implements Planet{
    static class MoonHolder{
        public static final Moon HOLDER = new Moon();
    }
    public static Moon getInstance(){
        return Moon.MoonHolder.HOLDER;
    }
}
