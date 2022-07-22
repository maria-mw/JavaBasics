package Java_Basics.Lesson_10.HW;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Task1 {
    public static void main(String[] args) {
        File directory = new File("folder");
        File myFile = new File(directory, "file.txt");

//        directory.mkdir();
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        try (InputStream inputStream = new FileInputStream(myFile)) {
            int i = inputStream.read();
            while (i != -1) {
                System.out.print((char)i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
