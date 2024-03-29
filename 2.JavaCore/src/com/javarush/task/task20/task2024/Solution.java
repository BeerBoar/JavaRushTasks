package com.javarush.task.task20.task2024;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

/* 
Знакомство с графами
*/

public class Solution implements Serializable {
    private String task;
    private String description;

    public Solution(String task, String description) {
        this.task = task;
        this.description = description;
    }

    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Our writeObject");
    }

    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("Our readObject");
    }


    @Override
    public String toString() {
        return "Solution{" +
                "task='" + task + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Solution partizanka = new Solution("1409", "Serializable task");
        System.out.println("Before: \n" + partizanka);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("Solution.out"));

        out.writeObject(partizanka);
        out.close();

        ObjectInputStream in = new ObjectInputStream(new FileInputStream("Solution.out"));
        partizanka = (Solution) in.readObject();

        System.out.println("After: \n" + partizanka);
    }
}