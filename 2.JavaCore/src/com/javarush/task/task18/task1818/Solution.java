package com.javarush.task.task18.task1818;

/* 
Два в одном
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream firstFile = new FileOutputStream(reader.readLine());
        FileInputStream secondFile = new FileInputStream(reader.readLine());
        FileInputStream thirdFile = new FileInputStream(reader.readLine());

//        char[] arr = new char[1000];
        while (secondFile.available() > 0) {
            int value = secondFile.read();
            firstFile.write(value);
        }

        while (thirdFile.available() > 0) {
            int value = thirdFile.read();
            firstFile.write(value);
        }

        thirdFile.close();
        secondFile.close();
        firstFile.close();
        reader.close();
    }
}
