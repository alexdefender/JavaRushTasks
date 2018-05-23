package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
        words.add("стол");
    }

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        reader.close();
        FileReader fr = new FileReader(fileName);
        BufferedReader buffR = new BufferedReader(fr);

        while (buffR.ready()) {
            String textLine = buffR.readLine();
            String[] tempLine = textLine.split(" ");
            int count1 = 0;
            for (String temp : tempLine) {
                for (String tempMap : words) {
                    if (temp.equals(tempMap)) {
                        count1++;
                    }
                }
            }
            if (count1 == 2) {
                System.out.println(textLine);
            }
        }

        buffR.close();
        fr.close();
    }
}
