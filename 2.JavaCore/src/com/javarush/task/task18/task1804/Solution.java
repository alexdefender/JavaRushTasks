package com.javarush.task.task18.task1804;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Самые редкие байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        final String filename = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inStream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> counts = new HashMap<>();

        int min = 0;
        while (inStream.available() > 0) {
            int b = inStream.read();
            int count = counts.getOrDefault(b, 0) + 1;
            counts.put(b, count);

            min = Math.min(b, count);
        }

//        System.out.println(min);

        int minCount = min;
        String result = counts.entrySet()
                .stream()
                .filter(e -> e.getValue() == minCount)
                .map(e -> e.getKey())
                .map(k -> k.toString())
                .collect(Collectors.joining(" "));
        inStream.close();
        reader.close();

        System.out.println(result);
    }
}
