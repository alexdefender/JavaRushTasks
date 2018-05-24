package com.javarush.task.task25.task2515;

public class Rocket extends BaseObject {
    @Override
    public void draw(Canvas canvas) {
        canvas.setPoint(x, y, 'R');
    }

    @Override
    public void move() {
        y--;
    }

    public Rocket(double x, double y) {
        super(x, y, 1);
    }

    @Override
    public boolean isAlive() {
        return super.isAlive();
    }

    @Override
    public double getX() {
        return super.getX();
    }

    @Override
    public void setX(double x) {
        super.setX(x);
    }

    @Override
    public double getY() {
        return super.getY();
    }

    @Override
    public void setY(double y) {
        super.setY(y);
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    @Override
    public void setRadius(double radius) {
        super.setRadius(radius);
    }
}
