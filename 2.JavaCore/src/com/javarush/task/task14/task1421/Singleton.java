package com.javarush.task.task14.task1421;

public abstract class Singleton {
    private static Singleton instance;
    
    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public static void setInstance(Singleton instance) {
        Singleton.instance = instance;
    }
}
