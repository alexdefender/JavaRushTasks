package com.javarush.task.task19.task1904;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
//        PersonScanner personScanner = new PersonScannerAdapter(new Scanner(new FileReader("1.txt")));
//        System.out.println(personScanner.read());

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public Person read() throws IOException {
            try {
                String[] text = fileScanner.nextLine().split(" ");
                String name = text[1];
                String middleName = text[2];
                String lastName = text[0];
                SimpleDateFormat date = new SimpleDateFormat("dd MM yyyy", Locale.getDefault());
                Date parse = date.parse(text[3] + " " + text[4] + " " + text[5]);
                return new Person(name,middleName,lastName,parse);
            } catch (ParseException e) {
                e.printStackTrace();
                return null;
            }
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
