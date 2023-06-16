package com.javarush.task.task15.task1522;

public class Sun implements Planet{
    static class SunHolder{
        public static final Sun HOLDER = new Sun();
    }
    public static Sun getInstance(){
        return SunHolder.HOLDER;
    }
}
