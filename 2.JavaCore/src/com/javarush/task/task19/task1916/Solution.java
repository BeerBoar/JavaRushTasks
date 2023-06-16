package com.javarush.task.task19.task1916;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/*
Отслеживаем изменения
C:\Users\Veniol\Desktop\src.txt
C:\Users\Veniol\Desktop\dest.txt
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) {
        try (BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader r1 = new BufferedReader(new FileReader(r.readLine()));
             BufferedReader r2 = new BufferedReader(new FileReader(r.readLine()))) {
            List<String> f1 = new ArrayList<>();
            List<String> f2 = new ArrayList<>();
            while (r1.ready()){
                f1.add(r1.readLine());
            }
            while (r2.ready()){
                f2.add(r2.readLine());
            }
            List<LineItem> sames = f1.stream().filter(f2::contains).map(x -> new LineItem(Type.SAME, x)).toList();
            List<LineItem> removed = f1.stream().filter(x->!(f2.contains(x))).map(x -> new LineItem(Type.REMOVED, x)).toList();
            List<LineItem> added = f2.stream().filter(x->!(f1.contains(x))).map(x -> new LineItem(Type.ADDED, x)).toList();
            lines.addAll(sames);
            lines.addAll(removed);
            lines.addAll(added);
            System.out.println(lines);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }

        @Override
        public String toString() {
            return "LineItem{" +
                    "type=" + type +
                    ", line='" + line + '\'' +
                    '}';
        }
    }
}
