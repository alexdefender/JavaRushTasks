package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/* 
Самые частые байты
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        final String filename = args[0];
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream stream = new FileInputStream(reader.readLine());
        Map<Integer, Integer> counts = new HashMap<>();

        int max = 0;
        while (stream.available() > 0) {
            int b = stream.read();
            int count = counts.getOrDefault(b, 0) + 1;
            counts.put(b, count);

            max = Math.max(max, count);
        }

        int maxCount = max;
        String result = counts.entrySet()
                .stream()
                .filter(e -> e.getValue() == maxCount)
                .map(e -> e.getKey())
                .map(k -> k.toString())
                .collect(Collectors.joining(" "));
        stream.close();
        reader.close();

        System.out.println(result);
    }

}
