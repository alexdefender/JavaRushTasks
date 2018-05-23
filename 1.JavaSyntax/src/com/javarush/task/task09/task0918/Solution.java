package com.javarush.task.task09.task0918;

/* 
Все свои, даже исключения
*/

import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws MyException4, MyException3 {
        try {
            method1();
        }
        catch (MyException e) {
            System.out.println(e);
        }
    }


    public static void method1() throws MyException, MyException2, MyException3, MyException4 {
        int i = (int) (Math.random() * 4);
        if (i == 0)
            throw new MyException();
        if (i == 1)
            throw new MyException2();
        if (i == 2)
            throw new MyException3();
        if (i == 3)
            throw new MyException4();
    }
    
    static class MyException extends ArithmeticException {
    }

    static class MyException2 extends ArrayIndexOutOfBoundsException {
    }

    static class MyException3 extends NoSuchFieldException {
    }

    static class MyException4 extends NoSuchMethodException {
    }
}

