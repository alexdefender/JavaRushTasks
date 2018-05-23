package com.javarush.task.task04.task0417;

/* 
Существует ли пара?
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String num = reader.readLine();
        int a = Integer.parseInt(num);
        String num1 = reader.readLine();
        int b = Integer.parseInt(num1);
        String num2 = reader.readLine();
        int c = Integer.parseInt(num2);

        if (a == b && a == c && b == c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (a == b) {
            System.out.println(a + " " + b);
        }
        else if (a == c) {
            System.out.println(a + " " + c);
        }
        else if (b == c) {
            System.out.println(b + " " + c);
        }
    }
}