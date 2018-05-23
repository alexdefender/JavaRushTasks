package com.javarush.task.task04.task0414;

/* 
Количество дней в году
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        int x = 366;
        int y = 365;
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String year = scan.readLine();
        int yeatInt = Integer.parseInt(year);

        if (yeatInt % 400 == 0) {
            System.out.println("количество дней в году: " + x);
        }
        else if (yeatInt % 4 == 0 && yeatInt % 100 != 0) {
            System.out.println("количество дней в году: " + x);
        }
        else {
            System.out.println("количество дней в году: " + y);
        }
    }
}