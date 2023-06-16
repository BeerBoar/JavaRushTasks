package com.javarush.games.minigames.mini08;

import com.javarush.engine.cell.*;

/* 
Работа с клавиатурой
*/

public class KeyboardGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);

        for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
                setCellColor(x, y, Color.WHITE);
            }
        }
    }

    @Override
    public void onKeyPress(Key key) {
        switch (key){
            case UP -> {
                for (int n = 0; n <3; n++){
                    setCellColor(n,0,Color.GREEN);
                }
            }
            case DOWN -> {
                for (int n = 0; n <3; n++){
                    setCellColor(n,2,Color.GREEN);
                }
            }
            case LEFT -> {
                for (int n = 0; n <3; n++){
                    setCellColor(0,n,Color.GREEN);
                }
            }
            case RIGHT -> {
                for (int n = 0; n <3; n++){
                    setCellColor(2,n,Color.GREEN);
                }
            }
        }
    }

    @Override
    public void onKeyReleased(Key key) {
        if(key == Key.LEFT || key == Key.RIGHT || key == Key.UP || key == Key.DOWN){
            for (int x = 0; x < getScreenWidth(); x++){
                for(int y=0;y<getScreenHeight();y++){
                    setCellColor(x,y,Color.WHITE);
                }
            }
        }
    }
    //напишите тут ваш код
}
