package com.javarush.task.task07.task0712;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* 
Самые-самые
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<String>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        for (int i = 0; i < 10; i++) {
            String text = reader.readLine();
            list.add(text);
        }
        int num_short = 0;
        String min = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (min.length() > list.get(i).length()) {
                min = list.get(i);
                num_short = i;
            }
        }

        int num_long = 0;
        String max = list.get(0);

        for (int i = 0; i < list.size(); i++) {
            if (max.length() < list.get(i).length()) {
                max = list.get(i);
                num_long = i;
            }
        }

        if (num_long < num_short) {
            System.out.println(list.get(num_long));
        } else {
            System.out.println(list.get(num_short));
        }
    }
}
