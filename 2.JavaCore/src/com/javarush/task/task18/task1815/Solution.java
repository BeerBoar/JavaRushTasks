package com.javarush.task.task18.task1815;

import java.util.List;

/* 
Таблица
*/

public class Solution {
    public class TableInterfaceWrapper implements TableInterface{
        private  TableInterface local;

        public TableInterfaceWrapper(TableInterface data) {
            this.local = data;
        }

        @Override
        public void setModel(List rows) {
            System.out.println(rows.size());
            local.setModel(rows);

        }

        @Override
        public String getHeaderText() {
            return local.getHeaderText().toUpperCase();
        }

        @Override
        public void setHeaderText(String newHeaderText) {
            local.setHeaderText(newHeaderText);
        }
    }

    public interface TableInterface {
        void setModel(List rows);

        String getHeaderText();

        void setHeaderText(String newHeaderText);
    }

    public static void main(String[] args) {
    }
}