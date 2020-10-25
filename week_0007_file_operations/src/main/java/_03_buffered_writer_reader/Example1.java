package _03_buffered_writer_reader;

/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 18:17
 */

import java.io.*;

public class Example1 {

    private static final String FILE_NAME = "buffer.txt";

    public static void main(String[] args) throws IOException {

        // file reader ve writer'a gore daha performanslı
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(new File(FILE_NAME)));

        bufferedWriter.write("Muhammed Topgul");
        bufferedWriter.write("\n");
        bufferedWriter.write("Java Developer");
        bufferedWriter.close();

        // satir satir okuyabilir
        BufferedReader bufferedReader = new BufferedReader(new FileReader(FILE_NAME));

        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);
        }
    }
}
