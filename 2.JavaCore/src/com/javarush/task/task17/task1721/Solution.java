package com.javarush.task.task17.task1721;

import java.io.*;
import java.util.ArrayList;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.List;

/* 
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();
    public static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


    public static void main(String[] args) throws IOException {
        BufferedReader firstFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        BufferedReader secondFile = new BufferedReader(new InputStreamReader(new FileInputStream(reader.readLine())));
        String firstString;
        while ((firstString = firstFile.readLine()) != null) {
            allLines.add(firstString);
        }
//        System.out.println(allLines);

        String secondString;
        while ((secondString = secondFile.readLine()) != null) {
            forRemoveLines.add(secondString);
        }
//        System.out.println(forRemoveLines);

        firstFile.close();
        secondFile.close();

        try {
            Solution solution = new Solution();
            solution.joinData();
        } catch (CorruptedDataException e) {
            System.out.println("Поймал");
        }

//        System.out.println("after");
//        System.out.println(allLines);
//        System.out.println(forRemoveLines);
    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines)) {
            allLines.removeAll(forRemoveLines);
        }
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }
    }
}


