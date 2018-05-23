package com.javarush.task.task19.task1906;

/* 
Четные символы
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        FileReader fileReader = new FileReader(firstFile);
        FileWriter fileWriter = new FileWriter(secondFile);
        int count = 0;
        while (fileReader.ready()) {
            int data = fileReader.read();
            count++;
            if (count % 2 == 0) {
                fileWriter.write(data);
            }
        }

        fileWriter.close();
        fileReader.close();
        reader.close();
    }
}
