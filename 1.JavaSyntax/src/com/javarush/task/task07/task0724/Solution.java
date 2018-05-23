package com.javarush.task.task07.task0724;

/* 
Семейная перепись
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Human grandFather = new Human("Tom", true, 60);
        Human grandFather1 = new Human("Jack", true, 61);
        Human grandMother = new Human("Ann", false, 58);
        Human grandMother1 = new Human("July", false, 59);
        Human father = new Human("Andrey", true, 35, grandFather, grandMother);
        Human mother = new Human("Elena", false, 33, grandFather1, grandMother1);
        Human son = new Human("Tim", true, 15, father, mother);
        Human son1 = new Human("Egor", true, 13, father, mother);
        Human dauter = new Human("Emilia", false, 11, father, mother);

        System.out.println(grandFather);
        System.out.println(grandFather1);
        System.out.println(grandMother);
        System.out.println(grandMother1);
        System.out.println(father);
        System.out.println(mother);
        System.out.println(son);
        System.out.println(son1);
        System.out.println(dauter);
    }

    public static class Human {
        //напишите тут ваш код
        String name;
        boolean sex;
        int age;
        Human father;
        Human mother;

        public Human(String name, boolean sex, int age) {
            this.name = name;
            this.sex = sex;
            this.age = age;
        }

        public Human(String name, boolean sex, int age, Human father, Human mother) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.father = father;
            this.mother = mother;
        }

        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}






















