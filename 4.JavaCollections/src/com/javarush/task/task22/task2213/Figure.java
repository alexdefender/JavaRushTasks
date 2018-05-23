package com.javarush.task.task22.task2213;

// фигура
public class Figure {
    private int x;
    private int y;
    private int[][] matrix;     // 1 - клетка есть, 0 - клетка пустая

    public Figure(int x, int y, int[][] matrix) {
        this.x = x;
        this.y = y;
        this.matrix = matrix;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void left() {
        x--;
        if (!isCurrentPositionAvailable())
            x++;
    }

    public void right() {
        x++;
        if (!isCurrentPositionAvailable())
            x--;
    }

    public void down() {
        y++;
    }

    public void up() {
        y--;
    }

    public void rotate() {
    }

    public void downMaximum() {
    }   // падение фигурки в низ до дн

    public boolean isCurrentPositionAvailable() {   // проверка - может ли фигурка быть помещена в текущую позицию
        return true;
    }

    public void landed() {  // вызывается, когда фигурка достигла дна или уперлась в другую фигурку

    }
}
