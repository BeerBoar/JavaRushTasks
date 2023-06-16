package com.javarush.task.task31.task3112;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.file.*;
import java.nio.file.attribute.FileAttribute;

/*
Загрузчик файлов
*/

public class Solution {

    public static void main(String[] args) throws IOException {
        Path passwords = downloadFile("https://javarush.ru/testdata/secretPasswords.txt", Paths.get("C:\\Users\\Veniol\\Desktop\\MyDir"));

        for (String line : Files.readAllLines(passwords)) {
            System.out.println(line);
        }
    }

    public static Path downloadFile(String urlString, Path downloadDirectory) throws IOException {
        URL url = new URL(urlString);
        Path dest = downloadDirectory.resolve(Paths.get("temp.txt"));
        try (InputStream inputStream = url.openStream()) {
            Files.copy(inputStream, Files.createFile(dest), StandardCopyOption.REPLACE_EXISTING);
        }
        return dest;// implement this method
    }
}
