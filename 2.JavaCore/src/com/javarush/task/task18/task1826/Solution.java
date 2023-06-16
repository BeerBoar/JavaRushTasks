package com.javarush.task.task18.task1826;

import java.io.*;

/* 
-e fileName fileOutputName
-d fileName fileOutputName
*/

public class Solution {
    public static void main(String[] args) {
        try {
            InputStream inputStream;
            FileOutputStream outputStream = new FileOutputStream(args[2]);
            switch (args[0]) {
                case "-e": {
                    inputStream = new ISWE(new ISWrapper(new FileInputStream(args[1])));
                    while (inputStream.available() > 0) {
                        outputStream.write(inputStream.read());


                    }
                    inputStream.close();
                    break;
                }
                case "-d": {
                    inputStream = new ISWD(new ISWrapper(new FileInputStream(args[1])));
                    while (inputStream.available() > 0) {
                        new FileOutputStream(args[2]).write(inputStream.read());
                    }
                    inputStream.close();
                    break;
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
