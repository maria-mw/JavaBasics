package Java_Basics.Lesson_5.HW;

public class Main {
    public static void main(String[] args) {
        //1. The longest word at the text (alternative solution)

        System.out.println("Original string: ");
        String inputText = "This is a test string99";
        System.out.println(inputText);
        inputText += " ";

        Integer index = 0;
        Boolean flag = true;
        Integer symbolIndex;

        Integer currentWordLength = 0;
        Integer longestWordLength = 0;
        String currentWord = "";
        String longestWord = "";

        while (flag) {
            symbolIndex = inputText.indexOf(" ", index);
            System.out.println(index);
            System.out.println(symbolIndex);
            if (symbolIndex != -1) {
                for (int i = index; i < symbolIndex+1; i++) {
                    char currentChar = inputText.charAt(i);
                    if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)
                            || (currentChar >= 128 && currentChar <= 175) || (currentChar >= 224 && currentChar <= 241)) {
                        currentWordLength++;
                        currentWord = currentWord + currentChar;
                    } else {
                        if ((currentChar == ' ') && (longestWordLength < currentWordLength)) {
                            longestWordLength = currentWordLength;
                            longestWord = currentWord;
                        }
                        currentWordLength = 0;
                        currentWord = "";
                    }
                    index = symbolIndex + 1;
                }
                System.out.println(currentWord);
                System.out.println(longestWord);
            } else {
                flag = false;
            }
        }

        System.out.println("The longest word at the text is " + longestWord);
    }

}
