package com.javarush.task.task04.task0415;

/* 
Правило треугольника
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String a1 = scan.readLine();
        int a = Integer.parseInt(a1);
        String b1 = scan.readLine();
        int b = Integer.parseInt(b1);
        String c1 = scan.readLine();
        int c = Integer.parseInt(c1);

        if (a + b > c && a + c > b && b + c > a) {
            System.out.println("Треугольник существует.");
        } else {
            System.out.println("Треугольник не существует.");
        }
    }
}