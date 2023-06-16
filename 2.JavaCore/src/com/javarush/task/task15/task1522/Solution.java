package com.javarush.task.task15.task1522;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/* 
Закрепляем паттерн Singleton
*/

public class Solution {
    public static void main(String[] args) {
        readKeyFromConsoleAndInitPlanet();
    }

    public static Planet thePlanet;

    //add static block here - добавьте статический блок тут

    public static void readKeyFromConsoleAndInitPlanet() {
        Scanner scan = new Scanner(System.in);
        switch (scan.nextLine()){
            case Planet.EARTH -> thePlanet = Earth.getInstance();
            case Planet.MOON -> thePlanet = Moon.getInstance();
            case Planet.SUN -> thePlanet = Sun.getInstance();
            default -> thePlanet = null;
        }
    }
}
