package com.javarush.task.task08.task0829;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* 
Модернизация ПО
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Map<String, String> map = new HashMap<String, String>();

        while (true) {
            String town = reader.readLine();
            if (town.isEmpty()) {
                break;
            }
            String lastName = reader.readLine();
            map.put(town, lastName);
        }

        String lastTown = reader.readLine();

        for (Map.Entry<String, String> pair : map.entrySet()) {
            if (lastTown.equals(pair.getKey())) {
                System.out.println(pair.getValue());
            }
        }
    }
}