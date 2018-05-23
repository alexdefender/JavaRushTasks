package com.javarush.task.task04.task0413;

/* 
День недели
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number = reader.readLine();
        int numberInt = Integer.parseInt(number);

        if (numberInt == 1) {
            System.out.println("понедельник");
        }
        else if (numberInt == 2) {
            System.out.println("вторник");
        }
        else if (numberInt == 3) {
            System.out.println("среда");
        }
        else if (numberInt == 4) {
            System.out.println("четверг");
        }
        else if (numberInt == 5) {
            System.out.println("пятница");
        }
        else if (numberInt == 6) {
            System.out.println("суббота");
        }
        else if (numberInt == 7) {
            System.out.println("воскресенье");
        }
        else if (numberInt < 1 || numberInt > 7) {
            System.out.println("такого дня недели не существует");
        }
    }
}