package com.javarush.task.task31.task3102;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

/* 
Находим все файлы
*/

public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        List<String> result = new ArrayList<>();
        class Visitor extends SimpleFileVisitor<Path>{
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                if (file!= null) result.add(file.toFile().getAbsolutePath());
                return FileVisitResult.CONTINUE;
            }
        }
        Files.walkFileTree(Paths.get(root), new Visitor());
        return result;
    }

    public static void main(String[] args) throws IOException {
        String root = "C:\\Users\\Veniol\\Desktop\\MyDir";
        getFileTree(root).forEach(System.out::println);
    }


}
