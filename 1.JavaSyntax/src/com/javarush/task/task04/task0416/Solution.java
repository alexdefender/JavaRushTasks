package com.javarush.task.task04.task0416;

/* 
Переходим дорогу вслепую
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader scan = new BufferedReader(new InputStreamReader(System.in));
        String x = scan.readLine();
        Double xD = Double.parseDouble(x);
        Double time = xD % 5;

        if (time >= 0 && time < 3){
            System.out.println("зелёный");
        } else if (time >= 3 && time < 4) {
            System.out.println("жёлтый");
        } else if (time >= 4 && time < 5){
            System.out.println("красный");
        }
    }
}