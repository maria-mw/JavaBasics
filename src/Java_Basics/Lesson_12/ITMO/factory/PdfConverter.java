package Java_Basics.Lesson_12.ITMO.factory;

public class PdfConverter implements DocumentConverter {
    @Override
    public void convertFile() {
        System.out.println("Convert file to pdf");
    }
}
