package com.javarush.task.task31.task3102;

import java.io.File;
import java.io.IOException;
import java.util.*;

/* 
Находим все файлы
*/
public class Solution {
    public static List<String> getFileTree(String root) throws IOException {
        File allFile = new File(root);
        List<String> listAllFile = new ArrayList<>();
        Queue<File> listTemp = new PriorityQueue<>();

        Collections.addAll(listTemp, allFile.listFiles());

        while (!listTemp.isEmpty()) {
            File fileTemp = listTemp.remove();
            if (fileTemp.isDirectory()) {
                Collections.addAll(listTemp, fileTemp.listFiles());
            } else {
                listAllFile.add(fileTemp.getAbsolutePath());
            }
        }
        return listAllFile;
    }


    public static void main(String[] args) throws IOException {
//        String folder = "D:\\Prog\\Javarush\\JavaRushTasks\\text";
//        for (String temp : getFileTree(folder)) {
//            System.out.println(temp);
//        }
    }
}
