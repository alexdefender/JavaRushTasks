package com.javarush.task.task19.task1908;

/* 
Выделяем числа
*/

import java.io.*;
import java.nio.CharBuffer;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String firstFile = reader.readLine();
        String secondFile = reader.readLine();
        reader.close();
        BufferedReader fileReader = new BufferedReader(new FileReader(firstFile));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(secondFile));

        String textFromFile = "";
        while (fileReader.ready()) {
            int data = fileReader.read();
            textFromFile += (char) data;
        }
        fileReader.close();

        String[] textFromFileBuff = textFromFile.split(" ");

        for (int i = 0; i < textFromFileBuff.length; i++) {
            if (isNumber(textFromFileBuff[i])) {
                fileWriter.write(textFromFileBuff[i] + " ");
            }
        }

        fileWriter.close();

    }

    public static boolean isNumber(String str){
        Pattern p = Pattern.compile("(^0$)|(^[1-9]([0-9])*)$");
        Matcher m = p.matcher(str);
        return m.find();
    }
}