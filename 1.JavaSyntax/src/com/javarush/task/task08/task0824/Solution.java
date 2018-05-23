package com.javarush.task.task08.task0824;

/* 
Собираем семейство
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human son = new Human("Дима", true, 20);
        Human son1 = new Human("Олег", true, 18);
        Human son2 = new Human("Вася", true, 16);
        ArrayList<Human> children = new ArrayList<Human>();
        children.add(son);
        children.add(son1);
        children.add(son2);
        Human father = new Human("Дмитрий", true, 40, children);
        Human mother = new Human("Лена", false, 38, children);
        ArrayList<Human> children1 = new ArrayList<Human>();
        children1.add(father);
        ArrayList<Human> children2 = new ArrayList<Human>();
        children2.add(mother);
        Human grandFather = new Human("Вася", true, 61, children1);
        Human grandFather1 = new Human("Андрей", true, 59, children2);
        Human grandMother = new Human("Лилия", false, 59, children1);
        Human grandMother1 = new Human("Маня", false, 57, children2);

        System.out.println(son);
        System.out.println(son1);
        System.out.println(son2);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);

    }

    public static class Human {
        //напишите тут ваш код
        public String name;
        public boolean sex;
        public int age;
        public ArrayList<Human> children = new ArrayList<Human>();

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }
            return text;
        }
    }
}
