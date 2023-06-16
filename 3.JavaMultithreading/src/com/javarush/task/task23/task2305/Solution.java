package com.javarush.task.task23.task2305;

/* 
Inner
*/

public class Solution {
    public InnerClass[] innerClasses = new InnerClass[2];

    public class InnerClass {
    }

    public static Solution[] getTwoSolutions() {
        Solution solution1 = new Solution();
        Solution solution2 = new Solution();
        InnerClass i1 = solution1.new InnerClass();
        InnerClass i2 = solution1.new InnerClass();
        InnerClass i3 = solution2.new InnerClass();
        InnerClass i4 = solution2.new InnerClass();
        solution1.innerClasses = new InnerClass[]{i1, i2};
        solution2.innerClasses = new InnerClass[]{i3, i4};
        return new Solution[]{solution1,solution2};
    }

    public static void main(String[] args) {

    }
}
