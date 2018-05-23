package com.javarush.task.task18.task1817;

/* 
Пробелы
*/

import java.io.*;
import java.text.DecimalFormat;


public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream fileInputStream = new FileInputStream(fileName);

        int p1 = 0;
        int p2 = 0; // пробелы

        while (fileInputStream.available() > 0) {
            int count = fileInputStream.read();
            if (count == 32) p2++;
            else p1++;
        }

        double sum = (double) p2 / (p1 + p2) * 100;
        String formatDouble = new DecimalFormat("0.00").format(sum);
        fileInputStream.close();
        System.out.print(formatDouble);
    }
}
