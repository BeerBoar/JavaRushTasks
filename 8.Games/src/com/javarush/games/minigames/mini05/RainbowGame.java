package com.javarush.games.minigames.mini05;

import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Color;

/* 
Цвета радуги
*/

public class RainbowGame extends Game {
    @Override
    public void initialize() {
        setScreenSize(10, 7);
        Color[] rainbow = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE, Color.INDIGO, Color.VIOLET};
        for (int x = 0; x < getScreenWidth(); x++){
            for (int y = 0; y < getScreenHeight(); y++){
                setCellColor(x,y,rainbow[y]);
            }
        }
    }

    //напишите тут ваш код
}
