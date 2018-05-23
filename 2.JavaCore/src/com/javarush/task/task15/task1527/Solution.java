package com.javarush.task.task15.task1527;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Парсер реквестов
*/

public class Solution {
    public static void main(String[] args) {
        //add your code here
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = "index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aaa";
        sampleMetod(text);

    }

    public static void alert(double value) {
        System.out.println("double " + value);
    }

    public static void alert(String value) {
        System.out.println("String " + value);
    }

    //javarush.ru/alpha/index.html?lvl=15&view&name=Amigo
    //javarush.ru/alpha/index.html?obj=3.14&name=Amigo
//index.html?lvl=15&view&name=Aobjmigo&obj=3.14&name=&obj=djsdcd&oobj=3.0&obj=1&obj=2.3&obj=aaa
    public static void sampleMetod(String line) {
        ArrayList<String> list = new ArrayList<>();
        for (String retval : line.split("&")) {
            list.add(retval);
        }

        for (int i = 0; i < list.size() - 2; i++) {
            if (list.get(i).contains("lvl") && list.get(i + 1).contains("view") && list.get(i + 2).contains("name")) {
                System.out.println("lvl viev name");
            }
        }

        System.out.println(list);
    }

}
