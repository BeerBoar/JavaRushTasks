package com.javarush.task.task15.task1522;

public class Earth implements Planet{
    static class EarthHolder{
        public static final Earth HOLDER = new Earth();
    }
    public static Earth getInstance(){
        return Earth.EarthHolder.HOLDER;
    }
}
