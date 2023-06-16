package com.javarush.games.minigames.mini09;

import com.javarush.engine.cell.Color;
import com.javarush.engine.cell.Game;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Таймер
*/

public class TimerGame extends Game {

    @Override
    public void initialize() {
        setScreenSize(3, 3);
        setTurnTimer(1000);
    }

    @Override
    public void onTurn(int step) {
        List<Integer> list = new ArrayList<>();
        Collections.addAll(list,0,1,2);
        setCellNumber(1,1,step);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                setCellColor(i,j, step%2 == 0 ? Color.GREEN : Color.ORANGE);
            }
        }
    }
}
