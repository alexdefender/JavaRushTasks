package com.javarush.task.task19.task1916;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        reader.close();

        BufferedReader readFirstFile = new BufferedReader(new FileReader(firstFileName));
        BufferedReader readSecondFile = new BufferedReader(new FileReader(secondFileName));


        while (readFirstFile.ready()) {
            System.out.println(readFirstFile.readLine());
        }

        while (readSecondFile.ready()) {
            System.out.println(readSecondFile.readLine());
        }

        readFirstFile.close();
        readSecondFile.close();
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
    }
}
