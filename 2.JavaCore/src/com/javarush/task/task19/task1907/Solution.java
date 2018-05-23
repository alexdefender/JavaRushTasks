package com.javarush.task.task19.task1907;

/* 
Считаем слово
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileReader fileReader = new FileReader(fileName);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String text = "";
        while (fileReader.ready()) {
            int data = fileReader.read();
            text += (char) data;
        }

        String newText = text.replaceAll("[!\"\\#$%&'()*+,\\-./:;<=>?@\\[\\\\\\]^_`{|}~.\r\n]", " ");
        String[] textBuff = newText.split(" ");

        int count = 0;
        for (int i = 0; i < textBuff.length; i++) {
            if (textBuff[i].equals("world")) count++;
        }

        System.out.println(count);
        bufferedReader.close();
        fileReader.close();
        reader.close();
    }
}
