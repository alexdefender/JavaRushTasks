package com.javarush.task.task08.task0819;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* 
Set из котов
*/

public class Solution {
    public static void main(String[] args) {
        Set<Cat> cats = createCats();

        //напишите тут ваш код. step 3 - пункт 3
        Iterator<Cat> iterator = cats.iterator();
        Cat text = iterator.next();
        cats.remove(text);

        printCats(cats);
    }

    public static Set<Cat> createCats() {
        //напишите тут ваш код. step 2 - пункт 2
        Set<Cat> cat = new HashSet<Cat>();
        cat.add(new Cat());
        cat.add(new Cat());
        cat.add(new Cat());
        return cat;
    }

    public static void printCats(Set<Cat> cats) {
        // step 4 - пункт 4
        Iterator<Cat> iterator = cats.iterator();

        while (iterator.hasNext()) {
            Cat text = iterator.next();
            System.out.println(text);
        }
    }

    // step 1 - пункт 1
    public static class Cat {

    }
}
