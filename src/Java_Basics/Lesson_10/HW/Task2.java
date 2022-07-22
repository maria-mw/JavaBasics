package Java_Basics.Lesson_10.HW;

import java.io.*;

public class Task2 {
    public static void main(String[] args) {
        File directory = new File("folder1");
        File myFile = new File(directory, "file1.txt");

        directory.mkdir();
        try {
            myFile.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        String text = "Hello world! Today is 11.07.2022";
        try (FileOutputStream outputStream = new FileOutputStream(myFile)) {
            byte[] buffer = text.getBytes();
            outputStream.write(buffer);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
