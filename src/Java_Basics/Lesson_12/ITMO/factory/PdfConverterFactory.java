package Java_Basics.Lesson_12.ITMO.factory;

public class PdfConverterFactory implements DocumentConverterFactory {
    @Override
    public DocumentConverter createConverter() {
        return new PdfConverter();
    }
}
