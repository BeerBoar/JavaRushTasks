package com.javarush.task.task18.task1810;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        try(BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
            while (true){
                try (FileInputStream input = new FileInputStream(reader.readLine())){
                    if (input.available() < 1000){
                        throw new DownloadException();
                    }
                }
            }
        }

    }

    public static class DownloadException extends Exception {

    }
}
