package com.javarush.task.task32.task3210;

import java.io.IOException;
import java.io.RandomAccessFile;

/* 
Используем RandomAccessFile
*/

public class Solution {
    public static void main(String... args) throws IOException {
//        args = new String[]{"text.txt", "10", "simple"};
        String fileName = args[0];
        int number = Integer.parseInt(args[1]);
        String text = args[2];

        RandomAccessFile raf = new RandomAccessFile(fileName, "rw");
        byte[] buff = new byte[text.length()];
        raf.seek(number);
        raf.read(buff, 0, text.length());

        String textFromFile = new String(buff);

        if (textFromFile.equals(text)) {
            raf.seek(raf.length());
            raf.write("true".getBytes());
        } else {
            raf.seek(raf.length());
            raf.write("false".getBytes());
        }
        raf.close();
    }
}
