package Java_Basics.Lesson_12.ITMO.factory;

public class Main {
    public static void main(String[] args) {
//        DocumentConverter converter1 = new PdfConverter();
//        converter1.convertFile();
        DocumentConverterFactory documentConverterFactory = createConverterFactoryByFormat("pdf");
        DocumentConverter converter = documentConverterFactory.createConverter();
        converter.convertFile();;
    }
    public static DocumentConverterFactory createConverterFactoryByFormat(String format) {
        if (format.equalsIgnoreCase("pdf")) {
            return new PdfConverterFactory();
        } else if (format.equalsIgnoreCase("csv")) {
            return new PdfConverterFactory(); //CsvConvFact
        } else if   (format.equalsIgnoreCase("docx")) {
            return new PdfConverterFactory(); //DocxConverterFactory()
        } else {
            throw new RuntimeException("Wrong format: " + format);
        }
    }
}
