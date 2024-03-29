package com.javarush.games.minigames.mini07;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;
import com.javarush.engine.cell.Key;

/* 
Работа с мышью
*/

public class PaintGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(5, 5);
        for (int x = 0; x < getScreenWidth(); x++) {
            for (int y = 0; y < getScreenHeight(); y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }
    @Override
    public void onMouseLeftClick(int x, int y) {
        setCellColor(x, y, Color.GREEN);
    }

    @Override
    public void onMouseRightClick(int x, int y) {
        setCellColor(x, y, Color.ORANGE);
    }
    //напишите тут ваш код
}
