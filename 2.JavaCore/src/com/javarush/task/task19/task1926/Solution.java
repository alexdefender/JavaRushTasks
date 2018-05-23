package com.javarush.task.task19.task1926;

/* 
Перевертыши
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fr = new FileReader(fileName);
        reader.close();

        String text = "";
        while (fr.ready()) {
            text += String.valueOf((char) fr.read());
        }
        fr.close();

        String[] buff = text.split("\n");

        for (String temp : buff) {
            text = new StringBuffer(temp).reverse().toString();
            System.out.println(text);
        }
    }
}
