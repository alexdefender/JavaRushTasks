package com.javarush.task.task18.task1816;

/* 
Английские буквы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName = args[0];
        FileInputStream inputStream = new FileInputStream(fileName);

        int count = 0;
        while (inputStream.available() > 0) {
            int temp = inputStream.read();
            if (temp >= 65 && temp <= 90 || temp >= 97 && temp <= 122) count++;


        }
        System.out.println(count);
        inputStream.close();
    }
}
