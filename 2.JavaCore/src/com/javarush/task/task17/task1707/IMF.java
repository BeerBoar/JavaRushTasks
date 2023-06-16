package com.javarush.task.task17.task1707;


public class IMF {

    private static volatile IMF imf;

    public static IMF getFund() {
        if (imf != null) {
            return imf;
        }else{
            synchronized (IMF.class){
                imf = new IMF();
                return imf;
            }
        }
    }

    private IMF() {
    }
}
