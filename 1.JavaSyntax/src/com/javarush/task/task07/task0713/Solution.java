package com.javarush.task.task07.task0713;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/* 
Играем в Jолушку
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        ArrayList<Integer> mainList = new ArrayList<Integer>();
        ArrayList<Integer> list3 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        ArrayList<Integer> listOther = new ArrayList<Integer>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 20; i++) {
            mainList.add(Integer.parseInt(reader.readLine()));
        }

        for (int i = 0; i < mainList.size(); i++) {
            Integer x = mainList.get(i);
            if (x % 3 == 0) {
                list3.add(x);
            }
        }

        for (int i = 0; i < mainList.size(); i++) {
            Integer x1 = mainList.get(i);
            if (x1 % 2 == 0) {
                list2.add(x1);
            }
        }

        for (int i = 0; i < mainList.size(); i++) {
            Integer x2 = mainList.get(i);
            if (x2 % 3 != 0 && x2 % 2 != 0) {
                listOther.add(x2);
            }
        }

        printList(mainList);
        printList(list3);
        printList(list2);
        printList(listOther);
    }

    public static void printList(List<Integer> list) {
        //напишите тут ваш код
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
