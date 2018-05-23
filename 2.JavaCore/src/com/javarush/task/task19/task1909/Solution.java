package com.javarush.task.task19.task1909;

/* 
Замена знаков
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));

        String textFromFile = "";
        while (fileReader.ready()) {
            int data = fileReader.read();
            textFromFile += (char) data;
        }
        fileReader.close();

        String textForFile = textFromFile.replace(".", "!");
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));
        fileWriter.write(textForFile);
        fileWriter.close();
    }
}
