package com.javarush.task.task07.task0705;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
Один большой массив и два маленьких
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array20 = new int[20];
        int[] array10_1 = new int[10];
        int[] array10_2 = new int[10];
        int j = 10;

        for (int i = 0; i < array20.length; i++) {
            array20[i] = Integer.parseInt(reader.readLine());
        }

        for (int i = 0; i < array10_1.length; i++) {
            array10_1[i] = array20[i];
        }
        for (int i = 0; i < array10_2.length; i++) {
            array10_2[i] = array20[j];
            j++;
        }

        for (int x:array10_2) {
            System.out.println(x);
        }
    }
}
