package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader(args[0]);
//        FileReader fr = new FileReader("4.txt");
        BufferedReader br = new BufferedReader(fr);

        while (br.ready()) {
            String[] buff = br.readLine().split(" ");
            String date = "", name = "";

            for (int i = buff.length - 3; i < buff.length; i++) {
                date += buff[i] + " ";
            }

            for (int i = 0; i < buff.length - 3; i++) {
                name += buff[i] + " ";
            }
            date = date.replaceAll(" $", "");
            name = name.replaceAll(" $", "");

//            System.out.println("date = " + date);

            DateFormat dateFormat = new SimpleDateFormat("dd MM yyyy");
            Date correctDate = null;
            try {
                correctDate = dateFormat.parse(date);
            } catch (ParseException e) {}
//            System.out.println("name = " + name + " - " + correctDate);

            PEOPLE.add(new Person(name, correctDate));
        }

        br.close();
        fr.close();
    }
}
