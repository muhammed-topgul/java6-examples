package _02_file_writer_reader;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 18:07
 */

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Example1 {

    private static final String FILE_NAME = "file-writer.txt";

    public static void main(String[] args) throws IOException {

        // write
        FileWriter fileWriter = new FileWriter(FILE_NAME);
        fileWriter.write("Muhammed Topgul");
        fileWriter.write("\n");
        fileWriter.write("Java Developer");
        fileWriter.write("\n");

        // close etmezsem yazmaz cunku flush etmiyor
        fileWriter.close();

        // read
        FileReader fileReader = new FileReader(FILE_NAME);

        // char ile karakter karakter okur
        char[] input = new char[100];
        fileReader.read(input);

        for (char c : input) {
            System.out.print(c);
        }

        // NOTE:
        // excel icin: apache poi
        // pdf ve world icin: jasper report
    }
}
