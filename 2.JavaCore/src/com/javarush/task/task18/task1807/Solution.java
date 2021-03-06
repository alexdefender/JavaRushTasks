package com.javarush.task.task18.task1807;

/* 
Подсчет запятых
*/

import java.io.*;
import java.util.zip.InflaterInputStream;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream = new FileInputStream(reader.readLine());

        int count = 0;
        while (fileInputStream.available() > 0) {
            int value = fileInputStream.read();

            if (value == 44) {
                count++;
            }
        }
        fileInputStream.close();
        reader.close();
        System.out.println(count);
    }
}
