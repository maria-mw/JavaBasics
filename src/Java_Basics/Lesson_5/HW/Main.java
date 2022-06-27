package Java_Basics.Lesson_5.HW;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //1. The longest word at the text
        String longestWord = "";
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the text: ");
        String string = scanner.nextLine();

        Integer currentWordLength = 0;
        Integer longestWordLength = 0;
        String currentWord = "";
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            if ((currentChar >= 65 && currentChar <= 90) || (currentChar >= 97 && currentChar <= 122)
                    || (currentChar >= 128 && currentChar <= 175) || (currentChar >= 224 && currentChar <= 241)) {
                currentWordLength++;
                currentWord = currentWord + currentChar;
            } else {
                if (longestWordLength < currentWordLength) {
                    longestWordLength = currentWordLength;
                    longestWord = currentWord;
                }
                currentWordLength = 0;
                currentWord = "";
            }
        }
        System.out.println("The longest word at the text is " + longestWord);

        //2. Palindrome
        System.out.println("Enter the word: ");
        String word = scanner.nextLine();
        Boolean isPalindrome = false;
        for (int i = 0, j = word.length() - 1; i < word.length() / 2; i++, j--) {
            char leftChar = word.charAt(i);
            char rightChar = word.charAt(j);
            if (leftChar == rightChar) {
                isPalindrome = true;
            } else {
                break;
            }
        }
        String message = isPalindrome ? "The word is palindrome" : "The word isn't palindrome";
        System.out.println(message);


//        String [] array = string.split(" ");
//        Integer wordLength = 0;
//        Integer wordPosition = -1;
//        for (int i = 0; i < array.length; i++) {
//            if (wordLength < array[i].length()) {
//                wordLength = array[i].length();
//                wordPosition = i;
//            }
//            System.out.println(array[i]);
//        }
//        System.out.println("The longest word at the text is " + array[wordPosition]);
        //2. Palindrome
        //3. Change the word to the "censored"
        //4. Number of entering the substring to the string
        //5. Words inversion
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter the first string: ");
//        String s1 = scanner.nextLine();
//        System.out.println("Enter the second string: ");
//        String s2 = scanner.nextLine();
//        System.out.println(s1);
//        System.out.println(s2);
//        scanner.close();
        scanner.close();

    }
}
