package _04_print_writer;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 18:25
 */

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Example1 {

    private static final String FILE_NAME = "print-writer.txt";

    public static void main(String[] args) throws FileNotFoundException {

        // en pratik ve performanslı yazma sınıfı
        // okuma sınıfı yok (PrintReader)
        PrintWriter printWriter = new PrintWriter(FILE_NAME);
        printWriter.println("Muhammed Topgul");
        printWriter.println("\n");
        printWriter.println("Java Developer");
        printWriter.close();


    }
}
