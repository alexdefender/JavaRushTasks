package com.javarush.task.task08.task0818;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* 
Только для богачей
*/

public class Solution {
    public static HashMap<String, Integer> createMap() {
        //напишите тут ваш код
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        map.put("Иванов", 501);
        map.put("Иванов1", 458);
        map.put("Иванов2", 258);
        map.put("Иванов3", 520);
        map.put("Иванов4", 530);
        map.put("Иванов5", 458);
        map.put("Иванов6", 560);
        map.put("Иванов7", 255);
        map.put("Иванов8", 330);
        map.put("Иванов9", 552);
        return map;

    }

    public static void removeItemFromMap(HashMap<String, Integer> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Integer>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry<String, Integer> pair = iterator.next();
            if (pair.getValue() < 500) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}