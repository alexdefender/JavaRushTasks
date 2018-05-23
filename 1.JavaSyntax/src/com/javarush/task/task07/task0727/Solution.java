package com.javarush.task.task07.task0727;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* 
Меняем функциональность
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        ArrayList<String> list = new ArrayList<String>();
        while (true) {
            String s = reader.readLine();
            if (s.isEmpty()) break;
            list.add(s);
        }

        ArrayList<String> listUpperCase = new ArrayList<String>();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).length() % 2 == 0) {
                String s = list.get(i);
                String s2 = String.join(" ", Collections.nCopies(2, s));
                listUpperCase.add(s2);
            }
            else if (list.get(i).length() % 2 != 0) {
                String s = list.get(i);
                String s2 = String.join(" ", Collections.nCopies(3, s));
                listUpperCase.add(s2);
            }
        }

        for (int i = 0; i < listUpperCase.size(); i++) {
            System.out.println(listUpperCase.get(i));
        }
    }
}
