package com.javarush.task.task04.task0412;

/* 
Положительное и отрицательное число
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int numberInt = Integer.parseInt(number);

        if (numberInt > 0) {
            System.out.println(numberInt + numberInt);
        }
        else if (numberInt < 0) {
            System.out.println(numberInt + 1);
        }
        else if (numberInt == 0) {
            System.out.println("0");
        }
    }
}