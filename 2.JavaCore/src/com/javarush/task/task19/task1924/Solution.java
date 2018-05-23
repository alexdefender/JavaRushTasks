package com.javarush.task.task19.task1924;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* 
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<Integer, String>();

    static {
        map.put(0, "ноль");
        map.put(1, "один");
        map.put(2, "два");
        map.put(3, "три");
        map.put(4, "четыре");
        map.put(5, "пять");
        map.put(6, "шесть");
        map.put(7, "семь");
        map.put(8, "восемь");
        map.put(9, "девять");
        map.put(10, "десять");
        map.put(11, "одиннадцать");
        map.put(12, "двенадцать");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fr = new FileReader(fileName);

        String text = "";
        while (fr.ready()) {
            int data = fr.read();
            text += (char) data;
        }

        String[] buff = text.split(" ");

        for (int i = 0; i < buff.length; i++) {
            try {
                if (map.containsKey(Integer.parseInt(buff[i]))) {
                    buff[i] = map.get(Integer.parseInt(buff[i]));
                }
            } catch (NumberFormatException e) {
            }
        }
        text = "";
        for (String temp : buff) {
            text += temp + " ";
        }
        System.out.println(text);

        fr.close();
    }
}