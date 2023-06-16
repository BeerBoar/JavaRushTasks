package com.javarush.task.task19.task1903;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
UA Ukraine
RU Russia
CA Canada
*/

public class Solution {

    public static Map<String, String> countries = new HashMap<String, String>();
    static{
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact{
        private final IncomeData data;

        public IncomeDataAdapter(IncomeData incomeData) {
            this.data = incomeData;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName()+", "+data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            char[] originalNumber =("" + data.getPhoneNumber()).toCharArray();
            char[] arrayNumber = new char[10];
            Arrays.fill(arrayNumber,'0');
            for(int i=0;i<originalNumber.length;i++) arrayNumber[arrayNumber.length-1-i] = originalNumber[originalNumber.length-1-i];
            String number = "("+arrayNumber[0]+arrayNumber[1]+arrayNumber[2]+")"+arrayNumber[3]+arrayNumber[4]+arrayNumber[5]+"-"+arrayNumber[6]+arrayNumber[7]+"-"+arrayNumber[8]+arrayNumber[9];
            return "+"+data.getCountryPhoneCode()+number;
        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}