package com.javarush.task.pro.task16.task1610;

import java.nio.file.Path;

public class Solution {
    public static void main(String[] args) {
        String str = "src.txt";
        Path path = Path.of(str);
        if(path.isAbsolute()){
            System.out.println(path + " ����������");;
        }
        else {
            path.toAbsolutePath();
            System.out.println(path + " ����� ��������");
        }
        Path absolutePath = path.toAbsolutePath();
        System.out.println(absolutePath);
    }
}
