package com.javarush.task.task19.task1923;

/* 
Слова с цифрами
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("3.txt"); //"3.txt"
//        FileWriter fw = new FileWriter(args[1]); //"4.txt"
        List<String> list = new ArrayList<>();

        String text = "";
        while (fr.ready()) {
            String temp = String.valueOf((char) fr.read());

            if (temp.equals(" ") || temp.equals("\n")) {
                list.add(text);
                text = "";
                temp = "";
            }
            text += temp;
        }
        list.add(text);
        fr.close();

        Pattern isNum = Pattern.compile("[0-9]");
        String words = list.stream()
                .filter(w -> isNum.matcher(w).find())
                .collect(Collectors.joining(" "));

        FileWriter fw = new FileWriter("4.txt");
        fw.write(words);
        fw.close();

        int index = 0;
        for (String temp : list) {
            Pattern p = Pattern.compile("[0-9]");
            Matcher m = p.matcher(temp);
            if (m.find()) {
                String separator = index++ < list.size() ? " " : ""; // убрать разделитель в конце строки
                fw.write(temp + separator);
            }
        }
        fw.close();
    }
}
