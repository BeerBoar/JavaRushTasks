package com.javarush.task.task31.task3101;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

public class MyFileVisitor extends SimpleFileVisitor<Path>  {
    StringBuilder sb;

    public MyFileVisitor(StringBuilder sb) {
        this.sb = sb;
    }

    @Override
   public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
       if (file.toFile().length() > 0){
           Files.readAllLines(file).forEach(x->sb.append(x).append("\n"));
           sb.append("\n");
       }
       return FileVisitResult.CONTINUE;
   }


}
