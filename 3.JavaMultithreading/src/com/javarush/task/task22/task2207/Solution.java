package com.javarush.task.task22.task2207;

import java.io.*;
import java.util.*;

/*
Обращенные слова
C:\Users\Veniol\Desktop\dest.txt
*/

public class Solution {
    public static List<Pair> result = new LinkedList<>();

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(new BufferedReader(new InputStreamReader(System.in)).readLine()))){
            while (reader.ready()){
                list.addAll(Arrays.asList(reader.readLine().split(" ")));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Set<Pair> set = new HashSet<>();
        List<String> dest = new ArrayList<>(list.size());
        dest.addAll(list);
        System.out.println(list);
        for (String s:list){
            String tmp = (new StringBuilder(s)).reverse().toString();
            if (dest.contains(tmp)){
                set.add(new Pair(s,tmp));
                dest.remove(s);
                dest.remove(tmp);
            }
        }
        result.addAll(set);
        System.out.println(result);
    }

    public static class Pair {
        String first;
        String second;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            Pair pair = (Pair) o;

            if (first != null ? !first.equals(pair.first) : pair.first != null) return false;
            return second != null ? second.equals(pair.second) : pair.second == null;

        }

        @Override
        public int hashCode() {
            int result = first != null ? first.hashCode() : 0;
            result = 31 * result + (second != null ? second.hashCode() : 0);
            return result;
        }

        @Override
        public String toString() {
            return first == null && second == null ? "" :
                    first == null ? second :
                            second == null ? first :
                                    first.compareTo(second) < 0 ? first + " " + second : second + " " + first;

        }

        public Pair(String first, String second) {
            this.first = first;
            this.second = second;
        }

        public Pair() {
        }
    }


}
