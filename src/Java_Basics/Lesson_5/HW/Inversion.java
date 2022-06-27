package Java_Basics.Lesson_5.HW;

public class Inversion {

    public static void main(String[] args) {
        //5. Inversion of words at the string
        System.out.println("Original string: ");
        String inputText = "This is a test string";
        System.out.println(inputText);
        inputText += " ";
        String invertedText = "";

        Integer index = 0;
        Boolean flag = true;
        Integer symbolIndex;

        while (flag) {
            symbolIndex = inputText.indexOf(" ", index);
            if (symbolIndex != -1) {
                for (int i = symbolIndex - 1; i >= index; i--) {
                    invertedText += inputText.charAt(i);
                }
                invertedText += " ";
                index = symbolIndex + 1;
            } else {
                flag = false;
            }
        }

        System.out.println("\nInverted string:");
        System.out.println(invertedText.trim());
    }
}