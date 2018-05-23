package com.javarush.task.task05.task0517;

/* 
Конструируем котиков
*/

public class Cat {
    String name;
    int age;
    int weight;
    String address;
    String color;

    public Cat(String name) {
        this.name = name;
        this.age = 7;
        this.weight = 8;
        this.color = "Black";
    }

    public Cat(String name, int weight, int age) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.color = "White";
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
        this.weight = 7;
        this.color = "Black";
    }

    public Cat(int weight, String color) {
        this.age = 7;
        this.weight = weight;
        this.color = color;
    }

    public Cat(int weight, String color, String address) {
        this.age = 7;
        this.weight = weight;
        this.color = color;
        this.address = address;
    }

    public static void main(String[] args) {

    }
}
