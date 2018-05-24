package com.javarush.task.task25.task2515;

// ответственный за "отрисовку" объектов
public class Canvas {
    private int width;
    private int height;
    private char[][] matrix;

    public Canvas(int width, int height) {
        this.width = width;
        this.height = height;
        matrix = new char[height][width];
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    // будет "ставить точку в координатах x,y цветом c"
    public void setPoint(double x, double y, char c) {
        int xRounded = (int) Math.round(x);
        int yRounded = (int) Math.round(y);

        if (xRounded >= 0 && xRounded < matrix[0].length && yRounded >= 0 && yRounded < matrix.length)
            matrix[yRounded][xRounded] = c;
    }

    // копирует переданную ему картинку (матрицу) в матрицу Canvas.
    // И не просто копирует, а начиная с координат x, y
    public void drawMatrix(double x, double y, int[][] matrix, char c) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != 0)
                    setPoint(x + j, y + i, c);
            }
        }
    }

    // будет очищать матрицу, чтобы на ней снова можно было рисовать
    public void clear() {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = ' ';
            }
        }
    }

    // отрисовывает матрицу на экран
    public void print() {
        System.out.println();
        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print(" ");
                System.out.print(matrix[i][j]);
                System.out.print(" ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
    }
}
