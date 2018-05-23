package com.javarush.task.task19.task1914;

/* 
Решаем пример
*/

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        //запоминаем настоящий PrintStream в специальную переменную
        PrintStream consoleStream = System.out;
        //Создаем динамический массив
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        //создаем адаптер к классу PrintStream
        PrintStream stream = new PrintStream(outputStream);
        //Устанавливаем его как текущий System.out
        System.setOut(stream);

        //Вызываем функцию, которая ничего не знает о наших манипуляциях
        testString.printSomething();

        //Преобразовываем записанные в наш ByteArray данные в строку
        String[] result = outputStream.toString().split(" ");
        int a = Integer.parseInt(result[0]);
        int b = Integer.parseInt(result[2]);
        int c = 0;
        switch (result[1]) {
            case "+": c = a + b;
            break;
            case "-": c = a - b;
            break;
            case "*": c = a * b;
            break;
        }
        //Возвращаем все как было
        System.setOut(consoleStream);
        System.out.println(a + " " + result[1] + " " + b + " " + result[3] + " " + c);
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("3 + 6 = ");
        }
    }
}

