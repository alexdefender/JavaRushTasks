package com.javarush.task.task12.task1226;

/* 
Лазать, летать и бегать
*/

public class Solution {

    public static void main(String[] args) {

    }

    public abstract class Cat implements Climb, Run {
    }

    public abstract class Dog implements Run {
    }

    public abstract class Tiger extends Cat {
    }

    public abstract class Duck implements Fly, Run {
    }

    public interface Fly {
        void fly();
    }

    public interface Climb {
        void climb();
    }

    public interface Run {
        void run();
    }
}
