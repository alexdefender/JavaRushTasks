package com.javarush.task.task14.task1419;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* 
Нашествие исключений
*/

public class Solution {
    public static List<Exception> exceptions = new ArrayList<Exception>();

    public static void main(String[] args) {
        initExceptions();

        for (Exception exception : exceptions) {
            System.out.println(exception);
        }
    }

    private static void initExceptions() {   //it's first exception
        try {
            float i = 1 / 0;

        } catch (Exception e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[2];
            arr[2] = 2;

        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[-2];

        } catch (NegativeArraySizeException e) {
            exceptions.add(e);
        }

        try {
            throw new NullPointerException("Кота не существует");
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            throw new NumberFormatException("неверное преобразование строки в числовой формат");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            throw new SecurityException("попытка нарушения безопасности");
        } catch (SecurityException e) {
            exceptions.add(e);
        }

        try {
            throw new ClassCastException ("неверное приведение");
        } catch (ClassCastException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalArgumentException ("неверный аргумент при вызове метода");
        } catch (IllegalArgumentException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalMonitorStateException ("неверная операция мониторинга");
        } catch (IllegalMonitorStateException e) {
            exceptions.add(e);
        }

        try {
            throw new IllegalStateException ("некорректное состояние приложения");
        } catch (IllegalStateException e) {
            exceptions.add(e);
        }


        //напишите тут ваш код

    }
}
