package com.javarush.task.task07.task0706;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Улицы и дома
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int[] array = new int[15];
        int plus = 0;
        int minus = 0;

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(reader.readLine());
            if (array[i] % 2 == 0 || array[i] == 0) {
                plus = plus + array[i];
            } else {
                minus = minus + array[i];
            }
        }

        if (plus > minus) {
            System.out.println("В домах с нечетными номерами проживает больше жителей.");
        } else {
            System.out.println("В домах с четными номерами проживает больше жителей.");
        }
    }
}