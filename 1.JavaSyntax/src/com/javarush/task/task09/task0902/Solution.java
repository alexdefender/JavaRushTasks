package com.javarush.task.task09.task0902;

/* 
И снова StackTrace
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        method1();
    }

    public static String method1() {
        method2();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        String methodName = element.getMethodName();
//        System.out.println("method 1 - " + methodName);
        return methodName;
        //напишите тут ваш код
    }

    public static String method2() {
        method3();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        String methodName = element.getMethodName();
//        System.out.println("method 2 - " + methodName);
        return methodName;
        //напишите тут ваш код
    }

    public static String method3() {
        method4();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        String methodName = element.getMethodName();
//        System.out.println("method 3 - " + methodName);
        return methodName;
        //напишите тут ваш код
    }

    public static String method4() {
        method5();
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        String methodName = element.getMethodName();
//        System.out.println("method 4 - " + methodName);
        return methodName;
        //напишите тут ваш код
    }

    public static String method5() {
        //напишите тут ваш код
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        StackTraceElement element = stackTrace[2];
        String methodName = element.getMethodName();
//        System.out.println("method 5 - " + methodName);
        return methodName;
    }
}
