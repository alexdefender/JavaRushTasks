package com.javarush.task.task12.task1220;

/* 
Класс Human и интерфейсы Run, Swim
*/

public class Solution {
    public static void main(String[] args) {

    }

    public abstract class Human implements Run, Swim {
        @Override
        public void speed() {

        }
    }

    public interface Run {
        void speed();
    }

    public interface Swim {
        void speed();
    }

    //add public interfaces and public class here - добавь public интерфейсы и public класс тут
}
