package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

/* 
Сортировка байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());

        Map<Integer, Integer> map = new TreeMap<>();

        while (inputStream.available() > 0) {
            int data = inputStream.read();
            int value = map.getOrDefault(data, 0) + 1;
            map.put(data, value);
        }

        for (Map.Entry<Integer, Integer> pair : map.entrySet()) {
            System.out.print(pair.getKey() + " ");
        }
        inputStream.close();
        reader.close();
    }
}
