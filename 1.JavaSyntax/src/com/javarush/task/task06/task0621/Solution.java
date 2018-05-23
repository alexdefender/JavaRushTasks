package com.javarush.task.task06.task0621;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* 
Родственные связи кошек
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String catGrandFather = reader.readLine();
        Cat grandFatherCat = new Cat(catGrandFather);

        String catGrandMother = reader.readLine();
        Cat grandMotherCat = new Cat(catGrandMother);

        String catFather = reader.readLine();
        Cat fatherCat = new Cat(catFather, grandFatherCat, null);

        String catMother = reader.readLine();
        Cat motherCat = new Cat(catMother, null, grandMotherCat);

        String catSon= reader.readLine();
        Cat sonCat = new Cat(catSon, fatherCat, motherCat);

        String catDauther = reader.readLine();
        Cat dauterCat = new Cat(catDauther, fatherCat, motherCat);

        System.out.println(grandFatherCat);
        System.out.println(grandMotherCat);
        System.out.println(fatherCat);
        System.out.println(motherCat);
        System.out.println(sonCat);
        System.out.println(dauterCat);
    }

    public static class Cat {
        private String name;
        private Cat pfather;
        private Cat pmother;

        Cat(String name) {
            this.name = name;
        }

        Cat(String name, Cat father, Cat mother) {
            this.name = name;
            this.pfather = father;
            this.pmother = mother;
        }

        @Override
        public String toString() {
            if (pfather == null && pmother == null)
                return "Cat name is " + name + ", no mother, no father ";
            else if (pmother == null && pfather != null)
                return "Cat name is " + name + ", no mother, father is " + pfather.name;
            else if (pfather == null && pmother != null)
                return "Cat name is " + name + ", mother is " + pmother.name + ", no father";
            else
                return "Cat name is " + name + ", mother is " + pmother.name + ", father is " + pfather.name;
        }
    }
}