package _01_create_file;/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 17:48
 */

import java.io.File;
import java.io.IOException;

public class Example2 {

    public static void main(String[] args) throws IOException {

        // 1. directory olustur
        File directory = new File("Folder");
        directory.mkdir();

        // 2. dosya olustur
        File file = new File(directory, "file.txt");
        file.createNewFile();

        //
        System.out.println(directory.isDirectory());
        System.out.println(directory.getAbsolutePath());
        System.out.println(directory);

        //
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        //
//        System.out.println(directory.delete()); // false-> cunku ici dolu
//        System.out.println(file.delete());

    }
}
