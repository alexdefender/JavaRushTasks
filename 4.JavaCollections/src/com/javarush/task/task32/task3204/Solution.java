package com.javarush.task.task32.task3204;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* 
Генератор паролей
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        ByteArrayOutputStream password = getPassword();
        System.out.println(password.toString());
    }

    public static ByteArrayOutputStream getPassword() throws IOException {
        ByteArrayOutputStream pass = new ByteArrayOutputStream();
        final String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        SecureRandom rnd = new SecureRandom();
        int len = 8;
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++) {
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        }
        Pattern digit = Pattern.compile("[0-9]");
        Matcher digitM = digit.matcher(sb);
        Pattern ABC = Pattern.compile("[A-Z]");
        Matcher ABCM = ABC.matcher(sb);
        Pattern abc = Pattern.compile("[a-z]");
        Matcher abcM = abc.matcher(sb);

        if (digitM.find() && ABCM.find() && abcM.find()) {
            pass.write(sb.toString().getBytes());
            return pass;
        } else
            return getPassword();
    }
}