package com.javarush.task.task10.task1015;

import java.util.ArrayList;
import java.util.Collections;

/* 
Массив списков строк
*/

public class Solution {
    public static void main(String[] args) {
        ArrayList<String>[] arrayOfStringList = createList();
        printList(arrayOfStringList);
    }

    public static ArrayList<String>[] createList() {
        //напишите тут ваш код
        ArrayList<String> arrayLists[] = new ArrayList[3];
        arrayLists[0] = new ArrayList<>(Collections.singleton("Java"));
        arrayLists[1] = new ArrayList<>(Collections.singleton("Java1"));
        arrayLists[2] = new ArrayList<>(Collections.singleton("Java3"));

        return arrayLists;
    }

    public static void printList(ArrayList<String>[] arrayOfStringList) {
        for (ArrayList<String> list : arrayOfStringList) {
            for (String s : list) {
                System.out.println(s);
            }
        }
    }
}