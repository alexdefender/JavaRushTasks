package com.javarush.task.task13.task1318;

import java.io.*;
import java.nio.file.FileSystemException;
import java.util.Scanner;

/* 
Чтение файла
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String text = reader.readLine();

        try {
            InputStream inst = new FileInputStream(text);

            while (inst.available() > 0) {
                System.out.print((char) inst.read());
            }
            System.out.println();

            inst.close();
            reader.close();
        } catch (FileSystemException e) {
            System.out.println("Такой файл не найден!");
        }
    }
}