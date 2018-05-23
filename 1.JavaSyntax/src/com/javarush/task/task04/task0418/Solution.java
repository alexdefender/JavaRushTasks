package com.javarush.task.task04.task0418;

/* 
Минимум двух чисел
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);
        String num1 = reader.readLine();
        int b = Integer.parseInt(num1);

        if (a < b) {
            if (a == b) {
                System.out.println(a);
            }
            System.out.println(a);
        } else
            System.out.println(b);
    }
}