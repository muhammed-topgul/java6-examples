package _05_other_metods;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 18:30
 */

import java.io.File;

public class Example1 {
    public static void main(String[] args) {

        File file = new File(".");

        String[] names = file.list();

        for (String name : names) {
            System.out.println(name);
        }

        System.out.println();

        File[] files = file.listFiles();
        for (File f : files) {
            if (f.isDirectory()) {
                System.out.println("Directory: " + f.getAbsolutePath());
            } else if (f.isHidden()) {
                System.out.println("Hidden: " + f.getAbsolutePath());
            } else {
                System.out.println("Normal: " + f.getAbsolutePath());
            }

        }
    }
}
