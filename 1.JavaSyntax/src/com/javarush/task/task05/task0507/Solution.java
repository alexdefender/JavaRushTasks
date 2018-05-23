package com.javarush.task.task05.task0507;

/* 
Среднее арифметическое
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = 0;
        double i = 0;
        double res;

        while (true) {
            int a = Integer.parseInt(reader.readLine());
            if (a != -1) {
                sum += a;
                i++;
            } else {
                res = sum / i;
                System.out.println(res);
                break;
            }
        }
    }
}

