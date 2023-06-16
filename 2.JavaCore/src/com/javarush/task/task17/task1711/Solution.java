package com.javarush.task.task17.task1711;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
-c name1 sex1 bd1 name2 sex2 bd2 ...
-u id1 name1 sex1 bd1 id2 name2 sex2 bd2 ...
-d id1 id2 id3 id4 ...
-i id1 id2 id3 id4 ...
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws Exception {
        Person person;
        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    for (int i = 1, n = 1; n <= args.length / 3; i += 3, n += 1) {
                        Date bd = sdf.parse(args[i + 2]);
                        if (args[i + 1].equals("м")) {
                            person = Person.createMale(args[i], bd);
                        } else {
                            person = Person.createFemale(args[i], bd);
                        }
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                    break;
                }
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        System.out.println(allPeople.get(Integer.parseInt(args[i])));
                    }

                    break;
                }
            case "-u":
                synchronized (allPeople) {
                    for (int i = 1, n = 1; n <= args.length / 4; i += 4, n += 1) {
                        Date bd = sdf.parse(args[i + 2]);
                        person = allPeople.get(i);
                        person.setName(args[i + 1]);
                        person.setBirthDate(bd);
                        if (args[i + 2].equals("м")) {
                            person.setSex(Sex.MALE);
                        } else {
                            person.setSex(Sex.FEMALE);
                        }
                    }
                    break;
                }
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        person = allPeople.get(Integer.parseInt(args[i]));
                        person.setName(null);
                        person.setBirthDate(null);
                        person.setSex(null);
                    }
                    break;
                }
        }

    }
}
