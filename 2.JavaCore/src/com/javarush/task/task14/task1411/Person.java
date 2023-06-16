package com.javarush.task.task14.task1411;

public interface Person {
    void work();
    static void doWork(String string){
        switch (string) {
            case "User" -> new User().work();
            case "Loser" -> new Loser().work();
            case "Coder" -> new Coder().work();
            case "Proger" -> new Proger().work();
        }
    }
    enum Type {
        USER ("User"),
        LOSER ("Loser"),
        CODER ("Coder"),
        PROGER ("Proger");
        private String str;
        Type (String str){
            this.str = str;
        }
        @Override
        public String toString() {
            return str;
        }
    }
}
    class User implements Person {
        public void work() {System.out.println("I usually just live.");}
    }
    class Loser implements Person {
        public void work() {
            System.out.println("I usually do nothing.");
        }
    }
    class Coder implements Person {
        public void work() {
            System.out.println("I usually write code.");
        }
    }
    class Proger implements Person {
        public void work() {
            System.out.println("It's a wonderful life!");
        }
    }
