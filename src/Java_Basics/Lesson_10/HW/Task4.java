package Java_Basics.Lesson_10.HW;

import java.io.*;

public class Task4 {
    public static void main(String[] args) {
        File directory = new File("folder2");
        File myFile1= new File(directory, "file2.txt");
        File myFile2 = new File(directory, "file3.txt");

        try {
            myFile2.createNewFile();
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

        String result = stringFormat(text.toString());

        try (FileOutputStream outputStream = new FileOutputStream(myFile2)) {
            byte[] buffer = result.getBytes();
            outputStream.write(buffer);
            System.out.println("The file has been written");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private static String stringFormat (String s) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetterOrDigit(s.charAt(i))){
                stringBuilder.append(s.charAt(i));
            } else {
                stringBuilder.append('$');
            }
        }
        return stringBuilder.toString();
    }
}
