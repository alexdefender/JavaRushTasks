package com.javarush.task.task04.task0420;

/* 
Сортировка трех чисел
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

        if (a >= b && b >= c) {
            System.out.println(a + " " + b + " " + c);
        }
        else if (a >= c && c >= b) {
            System.out.println(a + " " + c + " " + b);
        }
        else if (b >= a && a >= c) {
            System.out.println(b + " " + a + " " + c);
        }
        else if (b >= c && c >= a) {
            System.out.println(b + " " + c + " " + a);
        }
        else if (c >= b && b >= a) {
            System.out.println(c + " " + b + " " + a);
        }
        else if (c >= a && a >= b) {
            System.out.println(c + " " + a + " " + b);
        }
    }
}
