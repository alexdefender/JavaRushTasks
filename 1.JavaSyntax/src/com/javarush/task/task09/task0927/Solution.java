package com.javarush.task.task09.task0927;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* 
Десять котов
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, Cat> map = createMap();
        Set<Cat> set = convertMapToSet(map);
        printCatSet(set);
    }

    public static Map<String, Cat> createMap() {
        //напишите тут ваш код
        HashMap<String, Cat> map = new HashMap<String, Cat>();
        map.put("CatKey", new Cat("CatName"));
        map.put("CatKey1", new Cat("CatName1"));
        map.put("CatKey2", new Cat("CatName2"));
        map.put("CatKey3", new Cat("CatName3"));
        map.put("CatKey4", new Cat("CatName4"));
        map.put("CatKey5", new Cat("CatName5"));
        map.put("CatKey6", new Cat("CatName6"));
        map.put("CatKey7", new Cat("CatName7"));
        map.put("CatKey8", new Cat("CatName8"));
        map.put("CatKey9", new Cat("CatName9"));

        return map;
    }

    public static Set<Cat> convertMapToSet(Map<String, Cat> map) {
        //напишите тут ваш код
        Set<Cat> setCat = new HashSet<Cat>();
        for (Map.Entry<String, Cat> pair : map.entrySet()) {
            setCat.add(pair.getValue());

        }

        return setCat;
    }

    public static void printCatSet(Set<Cat> set) {
        for (Cat cat : set) {
            System.out.println(cat);
        }
    }

    public static class Cat {
        private String name;

        public Cat(String name) {
            this.name = name;
        }

        public String toString() {
            return "Cat " + this.name;
        }
    }
}
