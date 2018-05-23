package com.javarush.task.task18.task1819;

/* 
Объединение файлов
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFileName = reader.readLine();
        String secondFileName = reader.readLine();
        FileInputStream firstFile = new FileInputStream(firstFileName);

        byte[] buffer = new byte[firstFile.available()];
        while (firstFile.available() > 0) {
            int count = firstFile.read(buffer);
        }

        FileOutputStream firstFileOut = new FileOutputStream(firstFileName);
        FileInputStream secondFile = new FileInputStream(secondFileName);

        while (secondFile.available() > 0) {
            firstFileOut.write(secondFile.read());
        }

        firstFileOut.write(buffer);

        firstFileOut.close();
        secondFile.close();
        firstFile.close();
        reader.close();

    }
}
