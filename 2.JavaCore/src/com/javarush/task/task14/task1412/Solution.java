package com.javarush.task.task14.task1412;

/* 
Реализовать метод printMainInfo
*/

public class Solution {
    public static void main(String[] args) {
        Object obj = new Circle();
        Movable movable = (Movable) obj;
        Drawable drawable = new Rectangle();

        printMainInfo(movable);
        printMainInfo(drawable);

    }

    public static void printMainInfo(Object object) {
        //напишите тут ваш код
        if (object instanceof Circle) {
            Circle circle = (Circle) object;
            circle.move();
        } else if (object instanceof Rectangle) {
            Rectangle rectangle = (Rectangle) object;
            rectangle.draw();
        }

    }

    static interface Movable {

        void move();
    }

    static class Circle implements Movable {

        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }

    }

    static interface Drawable {
        void draw();
    }

    static class Rectangle implements Drawable {
        public void draw() {
            System.out.println("can be drawn");
        }

        public void move() {
            System.out.println("can be moved");
        }
    }
}
