package Java_Basics.Lesson_10.HW;

import java.io.*;

public class Task3 {
    public static void main(String[] args) {
        File directory1 = new File("folder");
        File directory2 = new File("folder1");
        File directory3 = new File("folder2");
        File myFile1 = new File(directory1, "file.txt");
        File myFile2= new File(directory2, "file1.txt");
        File myFile3= new File(directory3, "file2.txt");

        directory3.mkdir();
        try {
            myFile3.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        StringBuilder text = new StringBuilder();

        try (InputStream inputStream = new FileInputStream(myFile1)) {
            int i = inputStream.read();

            while (i != -1) {
                text.append((char) i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputStream = new FileInputStream(myFile2)) {
            int i = inputStream.read();

            while (i != -1) {
                text.append((char) i);
                i = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (FileOutputStream outputStream = new FileOutputStream(myFile3)) {
            byte[] buffer = text.toString().getBytes();
            outputStream.write(buffer);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
