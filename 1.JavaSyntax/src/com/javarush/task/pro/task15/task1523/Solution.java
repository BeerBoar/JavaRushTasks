package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;
import java.nio.*;
import java.nio.file.Files;
import java.util.Date;;

/* 
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        URLConnection connection = url.openConnection();
        connection.setDoOutput(true);
        try (OutputStream output = connection.getOutputStream();
             PrintStream printer = new PrintStream(output)) {
            printer.println("Hello!");
        }
        try (InputStream input = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(input))){
            while (reader.ready()){
                System.out.println(reader.readLine());
            }
        }
    }

}

