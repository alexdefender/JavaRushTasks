package com.javarush.task.task18.task1809;

/* 
Реверс файла
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream firstFile = new FileInputStream(reader.readLine());
        FileOutputStream secondFile = new FileOutputStream(reader.readLine());

        byte[] buffer = new byte[1000];
        int count = 0;
        while (firstFile.available() > 0) {
            count = firstFile.read(buffer);
        }

        byte tempCount = 0;
        for (int i = 0; i < count / 2; i++) {
            tempCount = buffer[i];
            buffer[i] = buffer[count - 1 - i];
            buffer[count - 1 - i] = tempCount;
        }

        secondFile.write(buffer, 0, count);

        secondFile.close();
        firstFile.close();
        reader.close();
        
    }
}
