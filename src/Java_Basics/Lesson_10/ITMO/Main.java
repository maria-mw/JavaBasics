package Java_Basics.Lesson_10.ITMO;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        
        File file1 = new File("folder/text.txt");
        File file2 = new File("folder/output.txt");

        try (BufferedReader reader = new BufferedReader(new FileReader(file1))) {
            String input ;
            while ((input = reader.readLine()) != null) {
                System.out.println(input);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        InputStream is = null;
        OutputStream os = null;

        try {
            is = new FileInputStream(file1);
            os = new FileOutputStream(file2);
            while (is.available() > 0){
                os.write(is.read());
            }
        } catch (IOException e) {
            System.err.println("Error:" + e.getMessage());
        } finally {
            try {
                if (is != null) {
                    is.close();
                }
                if (os != null) {
                    os.close();
                }
            } catch (IOException e){
                System.err.println("Error:" + e.getMessage());
            }
        }
        //apache poi

        Path path = Paths.get("C:");
        File[] files = path.toFile().listFiles();
//        if (files != null) {
//            for (File file : files) {
//                System.out.println(file.getName());
//            }
//        }

        System.out.println(new DecimalFormat("#.##")
                .format(path.toFile().getTotalSpace() / 1000000000.0) + "GB");
        System.out.println(path.getFileSystem());

        writeData(Arrays.asList("Java", "programming", "language"));
    }

    public static void writeData(List<String> stringList){
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("folder/output.txt"))){
            for (String s : stringList) {
                writer.write(s + "Hello!");
            }
        } catch (IOException e){
            System.err.println("Error:" + e.getMessage());
        }
    }
}
