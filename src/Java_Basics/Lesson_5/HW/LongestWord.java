package Java_Basics.Lesson_5.HW;

public class LongestWord {
    public static void main(String[] args) {
        //1. The longest word at the text

//        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String string = "This is a test string";

//        String string = scanner.nextLine();
        System.out.println(string);
        string += " ";
        Integer currentWordLength = 0;
        Integer longestWordLength = 0;
        String currentWord = "";
        String longestWord = "";

        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)
                    || (currentChar >= 128 && currentChar <= 175) || (currentChar >= 224 && currentChar <= 241)) {
                currentWordLength++;
                currentWord += currentChar;
            } else {
                if ((currentChar == ' ') && (longestWordLength < currentWordLength)) {
                    longestWordLength = currentWordLength;
                    longestWord = currentWord;
                }
                currentWordLength = 0;
                currentWord = "";
            }
        }

        System.out.println("The longest word at the text is '" + longestWord + "'");
//        scanner.close();
    }
}
