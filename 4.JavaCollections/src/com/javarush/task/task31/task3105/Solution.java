package com.javarush.task.task31.task3105;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import java.util.zip.ZipOutputStream;

/*
Добавление файла в архив
*/
public class Solution {
    static Map<String, ByteArrayOutputStream> map = null;

    public static void main(String[] args) {
        Solution s = new Solution();

        try (ZipInputStream zis = new ZipInputStream(new FileInputStream("D:\\Prog\\Javarush\\JavaRushTasks\\text\\text.zip"))) {
            s.deCompression(zis);
        } catch (Exception e) {e.printStackTrace();}

        try (ZipOutputStream zos = new ZipOutputStream(new FileOutputStream("D:\\Prog\\Javarush\\JavaRushTasks\\text\\text.zip"))) {
            s.compression(zos, "D:\\Prog\\Javarush\\JavaRushTasks\\text\\1.txt");
        } catch (Exception e) {e.printStackTrace();}
    }

    public static void deCompression(ZipInputStream zis) throws IOException {
        map = new HashMap<>();
        ZipEntry zipEntry;
        byte[] buffer = new byte[1024];
        int length;
        ByteArrayOutputStream baos;

        while ((zipEntry = zis.getNextEntry()) != null) {
            baos = new ByteArrayOutputStream();
            while ((length = zis.read(buffer)) > 0) {
                baos.write(buffer, 0, length);
            }
            map.put(zipEntry.getName(), baos);
        }
        zis.close();
    }

    public static void compression(ZipOutputStream zos, String link) throws IOException {
        ZipEntry zipEntry;

        for (Map.Entry<String, ByteArrayOutputStream> pair : map.entrySet()) {
            zipEntry = new ZipEntry(pair.getKey());
            zos.putNextEntry(zipEntry);
            zos.write(pair.getValue().toByteArray());
        }

        Path path = Paths.get(link);
        zipEntry = new ZipEntry("new\\" + path.getFileName());
        if (zipEntry.getName().equals(path.getFileName())) {
            zos.putNextEntry(zipEntry);
            Files.copy(Paths.get(link), zos);
        } else Files.move(Paths.get(link), (Path) zipEntry);
        zos.closeEntry();
    }
}
