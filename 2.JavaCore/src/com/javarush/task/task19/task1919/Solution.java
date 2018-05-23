package com.javarush.task.task19.task1919;

/* 
Считаем зарплаты
*/

import java.io.*;
import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;


public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(args[0]);
//        BufferedReader br = new BufferedReader(fileReader);
        Map<String, Double> map = new TreeMap<>();

        String text = "";
        while (fileReader.ready()) {
            int data = fileReader.read();
            text += Character.toString((char) data);
        }

        String[] buff = text.split("\n");

        for (int i = 0; i < buff.length; i++) {
            String[] buffMap = buff[i].split(" ");
            if (map.containsKey(buffMap[0])) {
                Double summ = map.get(buffMap[0]) + Double.valueOf(buffMap[1]);
                map.put(buffMap[0], summ);
            } else map.put(buffMap[0], Double.valueOf(buffMap[1]));
        }

        for (Map.Entry<String, Double> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " " + pair.getValue());
        }

//        while (br.ready()) {
//            String[] buff = br.readLine().split(" ");
//
//            if (map.containsKey(buff[0])) {
//                Double summ = map.get(buff[0]) + Double.valueOf(buff[1]);
//                map.put(buff[0], summ);
//            } else map.put(buff[0], Double.valueOf(buff[1]));
//        }
//
//        for (Map.Entry<String, Double> pair : map.entrySet()) {
//            System.out.println(pair.getKey() + " " + pair.getValue());
//        }

//        br.close();
        fileReader.close();
    }
}
