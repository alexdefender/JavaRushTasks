package com.javarush.task.task04.task0441;


/* 
Как-то средненько
*/
import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(proverka(a, b, c));
    }

    public static int proverka(int a, int b, int c) {
        if (a == b && a == c && b == c) {
            return a;
        } else if (a <= b && b <= c) {
            return b;
        }
        else if (b <= a && a <= c) {
            return a;
        }
        else if (a <= c && c <= b) {
            return c;
        }
        else if (a >= b && b >= c) {
            return b;
        }
        else if (b >= a && a >= c) {
            return a;
        }
        else if (a >= c && c >= b) {
            return c;
        }
        return 0;
    }
}

