package com.javarush.task.task25.task2515;

public class SpaceShip extends BaseObject {
    private double dx = 0;

    public SpaceShip(double x, double y) {
        super(x, y, 3);
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

    public void moveLeft() {
        dx = -1;
    }

    public void moveRight() {
        dx = 1;
    }

    @Override
    public void draw(Canvas canvas) {

    }

    @Override
    public void move() {
        x += dx;
        checkBorders(radius, Space.game.getWidth(), 1, Space.game.getHeight());
    }

    public void fire() {
        Rocket leftRocket = new Rocket(x - 2, y);
        Rocket rightRocket = new Rocket(x + 2, y);
        Space.game.getRockets().add(leftRocket);
        Space.game.getRockets().add(rightRocket);
    }
}
