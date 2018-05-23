package com.javarush.task.task18.task1808;

/* 
Разделение файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream firstFile = new FileInputStream(reader.readLine());
        FileOutputStream secondFile = new FileOutputStream(reader.readLine());
        FileOutputStream thirdFile = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[1000];
        int count = 0;
        while (firstFile.available() > 0) {
            count = firstFile.read(buffer);
        }
        if (count % 2 == 0) {
            int secondCount = count / 2;
            secondFile.write(buffer, 0, secondCount);
            thirdFile.write(buffer, secondCount, (count - secondCount));
        } else {
            int secondCount = count / 2 + 1;
            secondFile.write(buffer, 0, secondCount);
            thirdFile.write(buffer, secondCount, (count - secondCount));
        }

        thirdFile.close();
        secondFile.close();
        firstFile.close();
        reader.close();
    }
}