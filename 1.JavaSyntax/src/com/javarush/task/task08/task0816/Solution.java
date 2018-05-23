package com.javarush.task.task08.task0816;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

/* 
Добрая Зинаида и летние каникулы
*/

public class Solution {
    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();
        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Ivanon", new Date("JULY 2 1982"));
        map.put("Petrov", new Date("MARCH 1 1983"));
        map.put("Sidorov", new Date("JUNE 4 1985"));
        map.put("Savcnenko", new Date("SEPTEMBER 11 1983"));
        map.put("Sivoded", new Date("JULY 16 1990"));
        map.put("Vaskin", new Date("DECEMBER 8 1984"));
        map.put("Jukov", new Date("AUGUST 1 1980"));
        map.put("Kari", new Date("MAY 7 1983"));
        map.put("Koren", new Date("JUNE 25 1983"));
        return map;
        //напишите тут ваш код
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {
        //напишите тут ваш код
        Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();

        while (iterator.hasNext()) {
            HashMap.Entry<String, Date> pair = iterator.next();
            if (pair.getValue().getMonth() > 4 && pair.getValue().getMonth() < 8) {
                iterator.remove();
            }
        }
    }

    public static void main(String[] args) {

    }
}
