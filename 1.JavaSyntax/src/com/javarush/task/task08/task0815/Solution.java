package com.javarush.task.task08.task0815;

import java.util.HashMap;
import java.util.HashSet;

/* 
Перепись населения
*/

public class Solution {
    public static HashMap<String, String> createMap() {
        //напишите тут ваш код
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("Иванов", "Владимир");
        map.put("Сидоров", "Владимир");
        map.put("Петрова", "Елена");
        map.put("Симоненко", "Семен");
        map.put("Иванова", "Алина");
        map.put("Зайцев", "Роман");
        map.put("Гошуренко", "Василий");
        map.put("Петров", "Роман");
        map.put("Вагнер", "Василий");
        map.put("Савечев", "Алексей");
        return map;

    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        //напишите тут ваш код
        int count = 0;
        for (String value : map.values()) {
            if (value.equals(name)) {
                count++;
            }
        }
        return count;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
        //напишите тут ваш код
        int count = 0;
        for (String key : map.keySet()) {
            if (key.equals(lastName)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

    }
}
