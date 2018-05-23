package com.javarush.task.task10.task1019;

import java.io.*;
import java.util.HashMap;

/* 
Функциональности маловато!
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            String idString = reader.readLine();
            if (idString.isEmpty()) {
                break;
            }
            int id = Integer.parseInt(idString);
            String name = reader.readLine();
            if (name.isEmpty()) {
                break;
            }
            map.put(name, id);
        }
        for (HashMap.Entry<String, Integer> pair : map.entrySet()) {
            System.out.println(pair.getValue() + " " + pair.getKey());
        }
    }
}