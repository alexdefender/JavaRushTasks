package com.javarush.task.task16.task1632;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        Thread1 thread1 = new Thread1();
        Thread2 thread2 = new Thread2();
        Thread3 thread3 = new Thread3();
        Thread4 thread4 = new Thread4();
        Thread5 thread5 = new Thread5();

        threads.add(thread1);
        threads.add(thread2);
        threads.add(thread3);
        threads.add(thread4);
        threads.add(thread5);
    }

    public static void main(String[] args) {
        threads.get(0).start();
    }

    public static class Thread1 extends Thread {
        @Override
        public void run() {
            while (true) {}
        }
    }

    public static class Thread2 extends Thread {
        @Override
        public void run() {
            try {
                throw new InterruptedException();
            } catch (InterruptedException e) {
                System.out.println("InterruptedException");
            }
        }
    }

    public static class Thread3 extends Thread {
        @Override
        public void run() {
            while (true) {
                System.out.println("Ура");
                try {
                    sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static class Thread4 extends Thread implements Message {
        @Override
        public void run() {
            while (true) {
                if (new Thread().isAlive()) {
                    showWarning();
                }
            }
        }

        @Override
        public void showWarning() {
            stop();
        }

    }

    public static class Thread5 extends Thread {
        @Override
        public void run() {
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            int sum = 0;
            try {
                while (true) {
                    String line = reader.readLine();
                    if (line.equals("N")) {
                        System.out.println(sum);
                        break;
                    }
                    int a = Integer.parseInt(line);
                    sum += a;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}