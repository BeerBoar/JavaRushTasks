package com.javarush.games.minigames.mini03;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

public class SymbolGame extends Game {
    public static int a = 2;
    public static int b = 62;
    public static int c = 32;
    public static int d = 1;
    public static final int[][] SHIP = new int[][]{
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,c,c,d,d,d,d,d,d,d,d,d,d,d,c,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,c,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,c,b,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,c,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,c,c,c,c,c,a,a,a,c,c,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,c,b,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,c,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,a,a,c,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,c,d,d,c,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,b,a,a,c,c,a,c,c,c,c,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,d,d,d,d,d,a,a,d,d,d,d,d,d,d,d,c,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,a,d,d,d,d,d,d,d,d,d,d,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,b,b,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,b,d,c,c,d,d,d,d,d,d,d,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,a,a,c,d,d,d,d,a,b,c,a,a,a,a,b,d,d,c,a,c,a,c,d,d,d,d,d,d,d,d,d,d,d,d,b,d,d,d,c,a,a,a,a},
            {a,a,a,a,a,a,b,d,d,d,d,d,d,d,c,a,c,d,d,c,b,b,a,a,a,a,a,a,a,c,d,d,b,a,b,a,d,d,d,d,d,d,d,d,d,d,d,d,d,b,d,b,a,b,c,a,a,a},
            {a,b,a,a,a,c,d,d,d,d,d,d,d,d,b,a,c,d,b,b,a,a,a,a,a,a,a,a,a,c,d,b,a,a,a,a,b,d,d,d,a,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a},
            {a,c,c,c,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,b,a,a,a,a,a,b,a,a,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a},
            {a,a,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,d,d,c,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,c,b,a,a,a},
            {a,a,a,b,c,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,c,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a},
            {a,a,a,d,a,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,c,d,c,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,c,d,c,a,a,a},
            {a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,c,d,d,c,d,d,d,d,d,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,b,a,a,a},
            {a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,c,b,a,c,c,c,d,d,d,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a},
            {a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a,a,c,d,c,b,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a},
            {a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,b,c,a,a,c,d,c,b,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a},
            {a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,d,a,a,a,c,d,d,d,d,c,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a},
            {a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,c,c,a,b,b,c,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a},
            {a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,d,c,d,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a},
            {a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,d,d,c,d,d,d,c,c,c,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a},
            {a,a,a,a,d,d,c,d,d,d,d,d,d,d,d,d,d,c,a,a,a,d,d,a,c,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a},
            {a,a,d,d,d,d,a,b,d,d,d,d,d,d,d,d,d,d,a,a,a,d,c,a,a,a,c,d,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a},
            {a,a,c,b,c,c,a,c,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a},
            {a,a,a,a,d,d,c,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,d,a,a,a,a,a,a},
            {a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,c,b,a,a,a,a,a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,d,a,a,a,a,a,a},
            {a,a,a,b,b,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,d,c,a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,d,a,a,a,a,a,a},
            {a,a,a,a,d,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,b,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a},
            {a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,b,b,b,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,b,a,c,d,d,d,d,d,d,d,d,d,d,d,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,b,d,b,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,d,c,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,c,d,c,a,b,d,d,d,d,d,d,d,d,d,c,b,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,c,b,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,a,b,d,d,d,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,b,d,d,d,d,d,b,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,b,c,d,d,d,d,d,d,b,a,a,a,a,b,d,d,d,d,d,c,b,d,b,a,b,b,d,c,a,d,c,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a,a},
            {a,a,a,a,a,b,a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,c,a,d,c,a,a,b,a,a,c,d,c,d,d,d,d,d,d,d,d,d,d,d,d,d,b,a,a,a,a,a,a,a,a,a,a,a},
            {a,c,b,b,a,a,a,a,a,a,c,a,a,a,a,a,a,a,a,c,d,d,d,a,c,d,d,a,a,a,a,d,c,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a},
            {a,d,d,d,c,c,c,c,c,c,d,d,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,b,a,a,b,d,d,d,d,d,d,d,d,d,d,d,d,d,b,c,d,c,b,a,a,a,a,a,a,a,a},
            {a,b,d,d,d,d,d,d,d,d,d,d,a,a,a,a,a,a,a,a,a,a,c,d,d,d,d,d,d,d,c,b,c,d,d,d,d,d,d,d,d,d,d,d,d,d,a,a,d,c,c,d,b,a,a,a,a,a},
            {a,b,b,d,d,d,d,d,d,d,d,d,a,a,a,a,a,b,d,c,a,a,a,a,d,d,d,d,d,d,d,d,d,d,b,b,d,d,d,d,d,d,d,d,d,d,b,a,a,d,b,d,d,b,a,a,a,a},
            {a,a,a,a,d,d,d,d,d,d,d,d,d,a,a,a,a,a,c,d,c,a,a,a,b,d,d,d,d,d,d,d,d,d,d,c,d,d,d,d,d,d,d,d,d,d,d,b,a,b,d,b,d,b,a,a,a,a},
            {a,a,a,a,a,c,d,d,d,d,d,d,d,c,a,a,a,a,a,d,d,c,a,a,a,c,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,d,c,a,a,c,d,b,d,a,a,a,a},
            {a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,a,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,b,a,a,a,b,a,a,a,a,a,a},
    };
    @Override
    public void initialize() {
        setScreenSize(58,63);
        showShip();
    }

    //напишите тут ваш код

    public void showShip() {
        for (int i = 0; i < SHIP.length; i++) {
            for (int j = 0; j < SHIP[0].length; j++) {
                setCellColor(j, i, Color.values()[SHIP[i][j]]);
            }
        }
    }

}