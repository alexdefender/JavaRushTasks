package com.javarush.task.task03.task0325;

import java.io.*;

/* 
Финансовые ожидания
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String n = reader.readLine();
        int nInt = Integer.parseInt(n);
        System.out.print("Я буду зарабатывать $" + nInt + " в час");
    }
}
