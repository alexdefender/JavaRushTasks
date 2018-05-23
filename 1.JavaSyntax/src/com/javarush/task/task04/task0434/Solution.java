package com.javarush.task.task04.task0434;


/* 
Таблица умножения
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int a = 1, b = 1;

        while (a <= 10) {
            System.out.print(a + " ");
            while (b <= 9) {
                b++;
                System.out.print(a * b + " ");
            }
            a++;
            b = 1;
            System.out.println();
        }
    }
}