package _01_create_file;/*
 * created by Muhammed Topgul
 * on 25/10/2020
 * at 17:39
 */

import java.io.File;
import java.io.IOException;

public class Example1 {
    public static void main(String[] args) {

        File file = new File("muhammed.txt");
        // File objesi olusur
        // harddiskte yeni bir obje olusmaz

        try {
            System.out.println(file.createNewFile());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// java.io.File
// File -> dosya
// File sinifi, bir dosyayi (file) ya da bir dizn/directory/folder'i gosterebilir
// Dosyadan veri okumak ya da yazmak icin kullanılmaz
// File sınıfı yeni bir dosya olusturmak, klasor olusturmak, dosya silmek, isim degistirmek gibi islemler icin kullanılabilir
