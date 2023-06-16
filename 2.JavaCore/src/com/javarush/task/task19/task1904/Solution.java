package com.javarush.task.task19.task1904;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner{
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }
        @Override
        public Person read() throws IOException {
            try {
                String str = fileScanner.nextLine();
                String[] array = str.split(" ");
                DateFormat dateFormat = new SimpleDateFormat("MMddyyyy");
                Date date = dateFormat.parse(array[4]+array[3]+array[5]);
                return new Person(array[1], array[2], array[0],date);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
