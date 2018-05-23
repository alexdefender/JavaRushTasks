package com.javarush.task.task15.task1529;

public class Plane implements Flyable {
    int count;

    public Plane(int count) { // количество перевозимых пассажиров
        this.count = count;
    }

    @Override
    public void fly() {

    }
}
